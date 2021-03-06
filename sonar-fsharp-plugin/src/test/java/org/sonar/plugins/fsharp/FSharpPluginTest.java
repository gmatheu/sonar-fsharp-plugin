/*
 * Sonar FSharp Plugin, open source software quality management tool.
 *
 * Sonar FSharp Plugin is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * Sonar FSharp Plugin is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 */
package org.sonar.plugins.fsharp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.sonar.api.Plugin;
import org.sonar.api.SonarQubeVersion;

public class FSharpPluginTest {
  @Test
  public void testGetExtensions() throws Exception {
   Plugin.Context context = new Plugin.Context(SonarQubeVersion.V5_6);
   FSharpPlugin plugin = new FSharpPlugin();
   plugin.define(context);
   assertEquals(22, context.getExtensions().size());
  }
}
