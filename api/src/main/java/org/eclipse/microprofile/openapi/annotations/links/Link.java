/**
 * Copyright (c) 2017 Contributors to the Eclipse Foundation
 * Copyright 2017 SmartBear Software
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.eclipse.microprofile.openapi.annotations.links;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.eclipse.microprofile.openapi.annotations.servers.Server;

/**
 * The Link object represents a possible design-time link for a response. The presence of a link does not guarantee the
 * caller's ability to successfully invoke it, rather it provides a known relationship and traversal mechanism between
 * responses and other operations.
 * 
 * @see <a href= "https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.0.md#linkObject"> OpenAPI
 *      Specification Link Object</a>
 **/
@Target({})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Link {
    /**
     * The name of this link.
     * <p>
     * The name is REQUIRED when the link is defined within
     * {@link org.eclipse.microprofile.openapi.annotations.Components}. The name will be used as the key to add this
     * link to the 'links' map for reuse.
     * </p>
     * 
     * @return the link's name
     **/
    String name() default "";

    /**
     * A relative or absolute reference to an OAS operation. This field is mutually exclusive of the operationId field,
     * and must point to an Operation Object. Relative operationRef values may be used to locate an existing Operation
     * Object in the OpenAPI definition. Ignored if the operationId property is specified.
     * 
     * @return an operation reference
     **/
    String operationRef() default "";

    /**
     * The name of an existing, resolvable OAS operation, as defined with a unique operationId. This field is mutually
     * exclusive of the operationRef field.
     * 
     * @return an operation ID
     **/
    String operationId() default "";

    /**
     * Array of parameters to pass to an operation as specified with operationId or identified via operationRef.
     * 
     * @return the list of parameters for this link
     **/
    LinkParameter[] parameters() default {};

    /**
     * A description of the link. CommonMark syntax may be used for rich text representation.
     * 
     * @return the link's description
     **/
    String description() default "";

    /**
     * A literal value or {expression} to use as a request body when calling the target operation.
     * 
     * @return the request body of this link
     **/
    String requestBody() default "";

    /**
     * An alternative server to service this operation.
     * 
     * @return the server associated to this link
     **/
    Server server() default @Server;

    /**
     * Reference value to a Link object.
     * <p>
     * This property provides a reference to an object defined elsewhere. This property and all other properties are
     * mutually exclusive. If other properties are defined in addition to the ref property then the result is undefined.
     *
     * @return reference to a link
     **/
    String ref() default "";

}
