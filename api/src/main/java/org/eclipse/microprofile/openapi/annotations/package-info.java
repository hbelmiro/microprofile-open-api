/*
 * Copyright (c) 2017 Contributors to the Eclipse Foundation
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations
 * under the License.
 */

/**
 * A set of annotations, many derived from Swagger Core library. OpenAPI annotations can be augmented with existing
 * JAX-RS annotations in an application to produce a valid OpenAPI document.
 * 
 * Examples of annotations in this package include:
 * <ul>
 * <li>Components</li>
 * <li>ExternalDocumentation</li>
 * <li>OpenAPIDefinition</li>
 * <li>Operation</li>
 * </ul>
 * <p>
 * Example of usage:
 * 
 * <pre>
 *  {@literal @}GET
 *  {@literal @}Path("/findByStatus")
 *  {@literal @}Operation(summary = "Finds Pets by status",
 *            description = "Multiple status values can be provided with comma separated strings")
 *  public Response findPetsByStatus(...) { ... }
 * </pre>
 */

@org.osgi.annotation.versioning.Version("1.0")
package org.eclipse.microprofile.openapi.annotations;