/*******************************************************************************
 * Copyright 2012 André Rouél
 * Copyright 2012 Dominik Seichter
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
package net.sf.qualitycheck;

import java.lang.reflect.Constructor;

import org.junit.Test;

/**
 * Modul Test for the class {@link net.sf.qualitycheck.Check}
 * 
 * @author André Rouél
 * @author Dominik Seichter
 */
public class CheckTest {

	@Test
	public void giveMeCoverageForMyPrivateConstructor() throws Exception {
		// reduces only some noise in coverage report
		final Constructor<Check> constructor = Check.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		constructor.newInstance();
	}

	@Test(expected = java.lang.IllegalAccessException.class)
	public void testValidatesThatClassCheckIsNotInstantiable() throws ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		final Class<?> cls = Class.forName("net.sf.qualitycheck.Check");
		cls.newInstance(); // exception here
	}

}
