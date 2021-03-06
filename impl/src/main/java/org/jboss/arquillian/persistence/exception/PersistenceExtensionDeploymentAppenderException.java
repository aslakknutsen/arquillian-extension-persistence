/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.arquillian.persistence.exception;

public class PersistenceExtensionDeploymentAppenderException extends RuntimeException
{

   private static final long serialVersionUID = -4172000408985536802L;

   public PersistenceExtensionDeploymentAppenderException()
   {
   }

   public PersistenceExtensionDeploymentAppenderException(String message)
   {
      super(message);
   }

   public PersistenceExtensionDeploymentAppenderException(Throwable cause)
   {
      super(cause);
   }

   public PersistenceExtensionDeploymentAppenderException(String message, Throwable cause)
   {
      super(message, cause);
   }

}
