// Start of user code Copyright
/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *  
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *     Russell Boykin       - initial API and implementation
 *     Alberto Giammaria    - initial API and implementation
 *     Chris Peters         - initial API and implementation
 *     Gianluca Bernardini  - initial API and implementation
 *     Michael Fiedler      - Bugzilla adpater implementations
 *     Jad El-khoury        - initial implementation of code generator (https://bugs.eclipse.org/bugs/show_bug.cgi?id=422448)
 * 
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/
// End of user code

package org.eclipse.lyo.oslc.domains.cm;

import org.eclipse.lyo.oslc4j.core.model.OslcConstants;


// Start of user code imports
// End of user code

public interface Oslc_cmDomainConstants
{
    // Start of user code user constants
    // End of user code

    public static String CHANGE_MANAGEMENT_DOMAIN = "http://open-services.net/ns/cm#";
    public static String CHANGE_MANAGEMENT_NAMSPACE = "http://open-services.net/ns/cm#";
    public static String CHANGE_MANAGEMENT_NAMSPACE_PREFIX = "oslc_cm";

    public static String CHANGEREQUEST_PATH = "changeRequest";
    public static String CHANGEREQUEST_NAMESPACE = CHANGE_MANAGEMENT_NAMSPACE; //namespace of the rdfs:class the resource describes
    public static String CHANGEREQUEST_LOCALNAME = "ChangeRequest"; //localName of the rdfs:class the resource describes
    public static String CHANGEREQUEST_TYPE = CHANGEREQUEST_NAMESPACE + CHANGEREQUEST_LOCALNAME; //fullname of the rdfs:class the resource describes
}
