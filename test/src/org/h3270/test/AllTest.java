package org.h3270.test;

/*
 * Copyright (C) 2003, 2004 it-frameworksolutions
 *
 * This file is part of h3270.
 *
 * h3270 is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * h3270 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with h3270; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, 
 * MA 02111-1307 USA
 */

import junit.framework.*;

/**
 * @author <a href="mailto:andre.spiegel@it-fws.de">Andre Spiegel</a>
 * @version $Id$
 */
public class AllTest extends TestCase {

  public AllTest(String name) {
    super(name);
  }

  public static Test suite() {
    
    TestSuite suite = new TestSuite ("All h3270 tests");

    //suite.addTestSuite (FileScreenTest.class);
    suite.addTestSuite (S3270ScreenTest.class);
    suite.addTestSuite (RegexTest.class);
    suite.addTestSuite(SessionStateTest.class);
    
    return suite;
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(AllTest.class);
  }

}