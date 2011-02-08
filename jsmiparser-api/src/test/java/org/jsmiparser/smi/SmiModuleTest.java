/**
 * Copyright 2011-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jsmiparser.smi;

import static org.junit.Assert.assertEquals;

import org.jsmiparser.util.location.Location;
import org.jsmiparser.util.token.IdToken;
import org.junit.Test;

public class SmiModuleTest {
	private SmiMib m_mib = new SmiMib(new SmiOptions(),
			new SmiJavaCodeNamingStrategy("test"));
	private SmiModule m_module = new SmiModule(m_mib, new IdToken(new Location(
			"IF-MIBsource", 1, 0), "IF-MIB"));

	@Test
	public void testGetJavaId() {
		assertEquals("IfMib", m_module.getCodeId());
	}

}
