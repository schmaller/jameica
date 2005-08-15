/**********************************************************************
 * $Source: /cvsroot/jameica/jameica/src/de/willuhn/jameica/system/BackgroundTask.java,v $
 * $Revision: 1.4 $
 * $Date: 2005/07/26 22:58:34 $
 * $Author: web0 $
 * $Locker:  $
 * $State: Exp $
 *
 * Copyright (c) by willuhn.webdesign
 * All rights reserved
 *
 **********************************************************************/
package de.willuhn.jameica.system;

import de.willuhn.util.ProgressMonitor;

/**
 * Klassen, die dieses Interface implementieren, koennen in
 * Jameica als Hintergrund-Task in einem separaten Thread ausgefuehrt werden.
 * Sie werden ueber die Funktion <code>Application.start(BackgroundTask)</code> gestartet. 
 */
public interface BackgroundTask extends Runnable
{
	/**
	 * Liefert den Progress-Monitor.
   * @return Progress-Monitor.
   */
  public ProgressMonitor getMonitor();
}


/**********************************************************************
 * $Log: BackgroundTask.java,v $
 * Revision 1.4  2005/07/26 22:58:34  web0
 * @N background task refactoring
 *
 * Revision 1.4  2005/07/11 08:31:24  web0
 * *** empty log message ***
 *
 * Revision 1.3  2004/10/07 18:05:26  willuhn
 * *** empty log message ***
 *
 * Revision 1.2  2004/08/18 23:14:19  willuhn
 * @D Javadoc
 *
 * Revision 1.1  2004/08/11 00:39:25  willuhn
 * *** empty log message ***
 *
 * Revision 1.2  2004/08/09 22:24:16  willuhn
 * *** empty log message ***
 *
 * Revision 1.1  2004/08/09 21:03:15  willuhn
 * *** empty log message ***
 *
 **********************************************************************/