/**
 * <copyright>
 *
 * Copyright (c) 2002-2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: MappingRootItemProvider.java,v 1.4 2004/05/16 16:56:10 emerks Exp $
 */
package org.eclipse.emf.mapping.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
//import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.mapping.MappingPackage;
import org.eclipse.emf.mapping.MappingPlugin;
import org.eclipse.emf.mapping.MappingRoot;
import org.eclipse.emf.mapping.command.AddMappingCommand;
import org.eclipse.emf.mapping.command.CreateMappingCommand;
import org.eclipse.emf.mapping.command.RemoveMappingCommand;
import org.eclipse.emf.mapping.command.RestoreInitialStateCommand;
import org.eclipse.emf.mapping.domain.MappingDomain;


/**
 * This is the item provider adpater for a {@link org.eclipse.emf.mapping.MappingRoot} object.
 */
public class MappingRootItemProvider
  extends MappingItemProvider
  implements 
    IEditingDomainItemProvider,
    IStructuredItemContentProvider, 
    ITreeItemContentProvider, 
    IItemLabelProvider, 
    IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   */
  public MappingRootItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   */
  public List getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      MappingRoot mappingRoot = (MappingRoot)object;
      //MappingPackage ePackage = ((MappingRoot)object).ePackageMapping();
      MappingPackage ePackage = MappingPackage.eINSTANCE;

      boolean isTypeMapping = mappingRoot.getDomain() == null;

      if (!isTypeMapping)
      {
        // This is for the topDown feature.
        //
        itemPropertyDescriptors.add
          (new ItemPropertyDescriptor
            (adapterFactory,
             MappingPlugin.getPlugin().getString("_UI_OutputReadOnly_property_label"),
             MappingPlugin.getPlugin().getString("_UI_OutputReadOnly_property_description"),
             ePackage.getMappingRoot_OutputReadOnly(),
             true,
             ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE));
  
        // This is for the topDown feature.
        //
        itemPropertyDescriptors.add
          (new ItemPropertyDescriptor
            (adapterFactory,
             MappingPlugin.getPlugin().getString("_UI_TopToBottom_property_label"),
             MappingPlugin.getPlugin().getString("_UI_TopToBottom_property_description"),
             ePackage.getMappingRoot_TopToBottom(),
             false,
             ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE));
      }
    }
    return itemPropertyDescriptors;
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String getText(Object object)
  {
    return super.getText(object);
  }

  /**
   * This handles notification by delegating to {@link #fireNotifyChanged fireNotifyChanged}.
   */
  public void notifyChanged(Notification msg) 
  {
    //MappingPackage ePackage = ((MappingRoot)msg.getNotifier()).ePackageMapping();
    MappingPackage ePackage = MappingPackage.eINSTANCE;
    if (msg.getFeature() == ePackage.getMappingRoot_OutputReadOnly() || msg.getFeature() == ePackage.getMappingRoot_TopToBottom())
    {
      fireNotifyChanged(msg);
      //hgd::fireNotifyChanged(msg.getNotifier(), msg.getEventType(), msg.getStructuralFeature(), msg.getOldValue(), msg.getNewValue(), msg.getPosition());
      return;
    }
    super.notifyChanged(msg);
  }

  public Command createCommand(Object object, EditingDomain editingDomain, Class commandClass, CommandParameter commandParameter)
  {
    if (editingDomain instanceof MappingDomain) // && commandParameter instanceof MappingCommandParameter)
    {
      MappingDomain mappingDomain = (MappingDomain)editingDomain;

      if (commandClass == CreateMappingCommand.class)
      {
        return createCreateMappingCommand(mappingDomain, commandParameter.getCollection());
      }
      else if (commandClass == AddMappingCommand.class)
      {
        return createAddMappingCommand(mappingDomain, commandParameter.getCollection());
      }
      else if (commandClass == RemoveMappingCommand.class)
      {
        return createRemoveMappingCommand(mappingDomain, commandParameter.getCollection());
      }
      else if (commandClass == RestoreInitialStateCommand.class)
      {
        return createRestoreInitialStateCommand(mappingDomain);
      }
    }

    return super.createCommand(object, editingDomain, commandClass, commandParameter);
  }

  /**
   * This creates a primitive {@link org.eclipse.emf.mapping.command.CreateMappingCommand}.
   */
  protected Command createCreateMappingCommand(MappingDomain domain, Collection collection)
  {
    return new CreateMappingCommand(domain, collection);
  }

  /**
   * This creates a primitive {@link org.eclipse.emf.mapping.command.AddMappingCommand}.
   */
  protected Command createAddMappingCommand(MappingDomain domain, Collection collection)
  {
    return new AddMappingCommand(domain, collection);
  }

  /**
   * This creates a primitive {@link org.eclipse.emf.mapping.command.RemoveMappingCommand}.
   */
  protected Command createRemoveMappingCommand(MappingDomain domain, Collection collection)
  {
    return new RemoveMappingCommand(domain, collection);
  }

  /**
   * This creates a primitive {@link org.eclipse.emf.mapping.command.RestoreInitialStateCommand}.
   */
  protected Command createRestoreInitialStateCommand(MappingDomain domain)
  {
    return new RestoreInitialStateCommand(domain);
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceLocator getResourceLocator()
  {
    return MappingPlugin.INSTANCE;
  }

}
