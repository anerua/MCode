/*
 * Copyright © 2018 Martins Anerua
 */

package anerua.mcode;

import javax.swing.JFrame;
import javax.swing.JTextArea;

/*
 * @author Martins Anerua. Copyright � 2018, All rights reserved. 
 */
public class MPreter {

    Commands c = new Commands();
    Help h = new Help();

    public void mInterpreter(String command, String argue, JFrame fr, JTextArea view) {
        switch (command) {
            case "java":
                c.java(argue, view);
                break;
            case "python":
                c.python();
                break;
            case "cplus":
                c.cplus();
                break;
            case "type":
                c.type();
                break;
            case "acad":
                c.acad();
                break;    
            case "arduino":
                c.arduino();
                break;
//            case "game":
//                c.game(argue, view);
//                break;
            case "cir":
                c.cir();
                break;
            case "music":
                c.music();
                break;
            case "net":
                c.net(argue, view);
                break;
//            case "film":
//                c.film();
//                break;
            case "pics":
                c.pics();
                break;
//            case "mee":
//                c.mee(argue, view);
//                break;
//            case "eee":
//                c.eee(argue, view);
//                break;
//            case "mth":
//                c.mth();
//                break;
            case "calc":
                c.calc();
                break;
            case "note":
                c.note();
                break;
            case "map":
                c.map();
                break;
            case "settings":
                c.settings();
                break;
            case "blue":
                c.blue();
                break;
            case "cmd":
                c.cmd();
                break;
            case "ftp":
                c.ftp();
                break;
            case "paint":
                c.paint();
                break;
            case "key":
                c.key();
                break;
            case "snip":
                c.snip();
                break;
            case "record":
                c.record();
                break;
            case "sticky":
                c.sticky();
                break;
            case "task":
                c.task();
                break;
            case "file":
                c.file();
                break;
            case "foxit":
                c.foxit();
                break;
            case "down":
                c.down();
                break;
            case "shutdown":
                c.shutdown();
                break;
            case "restart":
                c.restart();
                break;
            case "hibernate":
                c.hibernate();
                break;
            case "hide":
                c.hide(fr);
                break;
            case "exit":
                c.exit(fr);
                break;
            case "cls":
                c.cls(view);
                break;
            case "date":
                c.date(view);
                break;
            case "time":
                c.time(view);
                break;
            case "pers":
                c.pers();
                break;
            case "comp":
                c.comp();
                break;
            case "config":
                c.config(view);
                break;
            case "off":
                c.off(argue, view);
                break;
            case "help":
                h.HelpG(view);
                break;
            case "matlab":
                c.matlab();
                break;
            case "bluestacks":
                c.bluestacks();
                break;
            case "html":
                c.html();
                break;
            case "rar":
                c.rar();
                break;
            case "photoshop":
                c.photoshop();
                break;
            case "electric":
                c.electric();
                break;
            case "":

                break;
            default:
                view.append("\n '" + command + "'" + "is not a recognized mCode command");
                view.append("\n Type 'help' to see a list of all commands");
                break;
        }
    }

}
