package org.h3270.host;

/*
 * Copyright (C) 2003 it-frameworksolutions
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

import java.util.List;

/**
 * Represents a terminal line connected to the host.
 * 
 * @author <a href="mailto:spiegel@it-fws.de">Andre Spiegel</a>
 * @version $Id$
 */
public interface Terminal {

  public abstract void disconnect();
  public abstract String getHostname();
  public abstract void dumpScreen(String filename);
  public abstract void startLogging();
  public abstract List getLog();
  public abstract void stopLogging();
  public abstract void updateScreen();
  public abstract Screen getScreen();
  public abstract void submitScreen();
  public abstract void submitUnformatted(String data);

  public abstract void clear();
  public abstract void enter();
  public abstract void eraseEOF();
  public abstract void pa(int number);
  public abstract void pf(int number);
  public abstract void reset();
  public abstract void sysReq();
  public abstract void attn();
}