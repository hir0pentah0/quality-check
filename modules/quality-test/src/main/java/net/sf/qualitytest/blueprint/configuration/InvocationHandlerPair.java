/*******************************************************************************
 * Copyright 2013 André Rouél and Dominik Seichter
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package net.sf.qualitytest.blueprint.configuration;

import javax.annotation.Nonnull;

import net.sf.qualitycheck.Check;
import net.sf.qualitytest.blueprint.invocationhandler.ProxyInvocationHandler;

/**
 * A pair of {@code Class} with accompanied {@code InvocationHandler}.
 * 
 * @author Dominik Seichter
 * 
 */
final class InvocationHandlerPair {

	private final Class<?> clazz;
	private final ProxyInvocationHandler invocationHandler;

	public InvocationHandlerPair(@Nonnull final Class<?> clazz, @Nonnull final ProxyInvocationHandler invocationHandler) {
		this.clazz = Check.notNull(clazz, "clazz");
		this.invocationHandler = Check.notNull(invocationHandler, "invocationHandler");
	}

	@Nonnull
	public Class<?> getKey() {
		return clazz;
	}

	@Nonnull
	public ProxyInvocationHandler getValue() {
		return invocationHandler;
	}

}
