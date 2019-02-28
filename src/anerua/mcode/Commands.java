/*
 * Copyright © 2018 Martins Anerua
 */

package anerua.mcode;

import java.awt.Frame;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Commands {

    public void java(String argue, JTextArea view) {
        switch(argue){
            case "":
                try {
                    Runtime.getRuntime().exec("C:\\Program Files (x86)\\NetBeans 8.2\\bin\\netbeans64.exe");
                } catch (IOException e) {
                }
                break;
            case "e":
                try {
                    Runtime.getRuntime().exec("C:\\Program Files (x86)\\Eclipse\\eclipse.exe");
                } catch (IOException e) {
                }
                break;
            case "n":
                try {
                    Runtime.getRuntime().exec("C:\\Program Files (x86)\\NetBeans 8.2\\bin\\netbeans64.exe");
                } catch (IOException e) {
                }
                break;
            default:
                view.append("\n -" + argue + " is an illegal argument of the command");
                break;
        }
    }

    public void python() {
        try {
            String[] s = {"explorer", "C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Python 3.1\\IDLE (Python GUI).lnk"};
            Runtime.getRuntime().exec(s);
        } catch (IOException e) {
        }
    }

    public void cplus() {
        try {
            Runtime.getRuntime().exec("C:\\Program Files (x86)\\CodeBlocks\\codeblocks.exe");
        } catch (IOException e) {
             
        }
    }

    public void type() {
        try {
            Runtime.getRuntime().exec("C:\\Program Files (x86)\\Broderbund\\Mavis Beacon Teaches Typing Platinum 20\\MavisBeacon.exe");
        } catch (IOException e) {
             
        }
    }

    public void acad() {
        try {
            String[] s = {"explorer", "C:\\Users\\MARTINS\\Documents\\Texts\\Acad\\Part 3\\First semester"};
            Runtime.getRuntime().exec(s);
        } catch (IOException e) {
             
        }
    }
    
    /*
    public void ntwrk() {
        try {
            String[] s = {"C:\\Program Files\\Foxit Software\\Foxit Reader\\FOXITREADER.EXE", "C:\\Users\\user\\Documents\\Texts\\Comp\\Ntwrk\\Network.pdf"};
            Runtime.getRuntime().exec(s);
        } catch (IOException e) {
             
        }
    }
    */

//    public void game(String argue, JTextArea view) {
//        switch (argue) {
//            case "":
//                try {
//                    String[] s = {"explorer", "C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Games"};
//                    Runtime.getRuntime().exec(s);
//                } catch (IOException e) {
//                     
//                }
//                break;
//            case "h":
//                try {
//                    Runtime.getRuntime().exec("C:\\Program Files\\Microsoft Games\\Hearts\\hearts.exe");
//                } catch (IOException e) {
//                     
//                }
//                break;
//            case "c":
//                try {
//                    Runtime.getRuntime().exec("C:\\Program Files\\Microsoft Games\\Chess\\chess.exe");
//                } catch (IOException e) {
//                     
//                }
//                break;
//            case "f":
//                try {
//                    Runtime.getRuntime().exec("C:\\Program Files\\Microsoft Games\\FreeCell\\FreeCell.exe");
//                } catch (IOException e) {
//                     
//                }
//                break;
//            case "m":
//                try {
//                    Runtime.getRuntime().exec("C:\\Program Files\\Microsoft Games\\Mahjong\\Mahjong.exe");
//                } catch (IOException e) {
//                     
//                }
//                break;
//            case "ms":
//                try {
//                    Runtime.getRuntime().exec("C:\\Program Files\\Microsoft Games\\Minesweeper\\MineSweeper.exe");
//                } catch (IOException e) {
//                     
//                }
//                break;
//            case "p":
//                try {
//                    Runtime.getRuntime().exec("C:\\Program Files\\Microsoft Games\\Purble Place\\PurblePlace.exe");
//                } catch (IOException e) {
//                     
//                }
//                break;
//            case "s":
//                try {
//                    Runtime.getRuntime().exec("C:\\Program Files\\Microsoft Games\\Solitaire\\solitaire.exe");
//                } catch (IOException e) {
//                     
//                }
//                break;
//            case "ss":
//                try {
//                    Runtime.getRuntime().exec("C:\\Program Files\\Microsoft Games\\SpiderSolitaire\\SpiderSolitaire.exe");
//                } catch (IOException e) {
//                     
//                }
//                break;
//            default:
//                view.append("\n -" + argue + " is an illegal argument of the command");
//                break;
//        }
//    }

    public void cir() {
        try {
            Runtime.getRuntime().exec("C:\\Program Files (x86)\\Labcenter Electronics\\Proteus 8 Professional\\BIN\\PDS.EXE");
        } catch (IOException e) {
             
        }
    }

    public void music() {
        try {
            Runtime.getRuntime().exec("C:\\Program Files\\Windows Media Player\\wmplayer.exe");
        } catch (IOException e) {
             
        }
    }

    public void net(String argue, JTextArea view) {
        switch (argue) {
            case "":
                try {
                    Runtime.getRuntime().exec("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
                } catch (IOException e) {
                     
                }
                break;
            case "c":
                try {
                    Runtime.getRuntime().exec("C:\\Users\\MARTINS\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
                } catch (IOException e) {
                     
                }
                break;
            case "f":
                try {
                    Runtime.getRuntime().exec("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
                } catch (IOException e) {
                     
                }
                break;
            case "i":
                try {
                    Runtime.getRuntime().exec("C:\\Program Files\\internet explorer\\iexplore.exe");
                } catch (IOException e) {
               
                }
                break;
            case "o":
                try {
                    Runtime.getRuntime().exec("C:\\Program Files (x86)\\Opera\\launcher.exe");
                } catch (IOException e) {
                     
                }
                break;
            case "u":
                try {
                    Runtime.getRuntime().exec("C:\\Program Files (x86)\\UCBrowser\\Application\\UCBrowser.exe");
                } catch (IOException e) {
                     
                }
                break;
            default:
                view.append("\n -" + argue + " is an illegal argument of the command");
                break;
        }
    }

    public void film() {
        try {
            Runtime.getRuntime().exec("cmd /c start unzip -o -q C:\\Users\\user\\Documents\\vlc-2.2.6-win32.zip -d C:\\Users\\user\\Documents\\vlc");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                 
            }
            Runtime.getRuntime().exec("C:\\Users\\user\\Documents\\vlc\\vlc-2.2.6\\vlc.exe");
        } catch (IOException e) {
             
        }
    }

    public void pics() {
        try {
            String[] s = {"explorer", "C:\\Users\\MARTINS\\Pictures"};
            Runtime.getRuntime().exec(s);
        } catch (IOException e) {
             
        }
    }

//    public void mee(String argue, JTextArea view) {
//        switch (argue) {
//            case "b":
//                try {
//                    String[] s = {"C:\\Program Files\\Foxit Software\\Foxit Reader\\FOXITREADER.EXE", "C:\\Users\\user\\Documents\\Texts\\Textbooks\\MEE206\\beer vector 10th e\\Beer Vector Mechanics 10th edition.pdf"};
//                    Runtime.getRuntime().exec(s);
//                } catch (IOException e) {
//                     
//                }
//                break;
//            case "bs":
//                try {
//                    String[] s = {"C:\\Program Files\\Foxit Software\\Foxit Reader\\FOXITREADER.EXE", "C:\\Users\\user\\Documents\\Texts\\Textbooks\\MEE206\\beer vector 10th e\\Beer Vector Mechanics 10th solns.pdf"};
//                    Runtime.getRuntime().exec(s);
//                } catch (IOException e) {
//                     
//                }
//                break;
//            case "":
//                try {
//                    String[] s = {"explorer", "C:\\Users\\user\\Documents\\Texts\\Textbooks\\MEE206"};
//                    Runtime.getRuntime().exec(s);
//                } catch (IOException e) {
//                     
//                }
//                break;
//            default:
//                view.append("\n -" + argue + " is an illegal argument of the command");
//                break;
//        }
//    }
//
//    public void eee(String argue, JTextArea view) {
//        switch (argue) {
//            case "a":
//                try {
//                    String[] s = {"C:\\Program Files\\Foxit Software\\Foxit Reader\\FOXITREADER.EXE", "C:\\Users\\user\\Documents\\Texts\\Textbooks\\EEE 204\\Agarwal A., Lang J., Foundations of Analog and Digital Electronic Circuits (The Morgan Kaufmann Series in Computer Architecture and Design)  .pdf"};
//                    Runtime.getRuntime().exec(s);
//                } catch (IOException e) {
//                     
//                }
//                break;
//            case "as":
//                try {
//                    String[] s = {"C:\\Program Files\\Foxit Software\\Foxit Reader\\FOXITREADER.EXE", "C:\\Users\\user\\Documents\\Texts\\Textbooks\\EEE 204\\EEE201 Solutions_Agarwal_and_Lang(Circuit Theory).pdf"};
//                    Runtime.getRuntime().exec(s);
//                } catch (IOException e) {
//                     
//                }
//                break;
//            case "s":
//                try {
//                    String[] s = {"C:\\Program Files\\Foxit Software\\Foxit Reader\\FOXITREADER.EXE", "C:\\Users\\user\\Documents\\Texts\\Textbooks\\EEE 204\\Charles K. Alexander, Matthew N.O. Sadiku-Fundamentals of Electric Circuits -McGraw-Hill(2008).pdf"};
//                    Runtime.getRuntime().exec(s);
//                } catch (IOException e) {
//                     
//                }
//                break;
//            case "ss":
//                try {
//                    String[] s = {"C:\\Program Files\\Foxit Software\\Foxit Reader\\FOXITREADER.EXE", "C:\\Users\\user\\Documents\\Texts\\Textbooks\\EEE 204\\solutions-manual-of-fundamentals-of-electric-circuits-4ed-by-alexander-m-sa.pdf"};
//                    Runtime.getRuntime().exec(s);
//                } catch (IOException e) {
//                     
//                }
//                break;
//            case "":
//                try {
//                    String[] s = {"explorer", "C:\\Users\\user\\Documents\\Texts\\Textbooks\\EEE 204"};
//                    Runtime.getRuntime().exec(s);
//                } catch (IOException e) {
//                     
//                }
//                break;
//            default:
//                view.append("\n -" + argue + " is an illegal argument of the command");
//                break;
//        }
//    }
//
    public void arduino() {
        try {
            Runtime.getRuntime().exec("C:\\Program Files (x86)\\Arduino\\arduino.exe");
        } catch (IOException e) {
             
        }
    }

    public void calc() {
        try {
            Runtime.getRuntime().exec("calc");
        } catch (IOException e) {
             
        }
    }

    public void note() {
        try {
            Runtime.getRuntime().exec("notepad");
        } catch (IOException e) {
             
        }
    }

    public void map() {
        try {
            Runtime.getRuntime().exec("charmap");

        } catch (IOException e) {
             
        }
    }

    public void settings() {
        try {
            Runtime.getRuntime().exec("control");
        } catch (IOException e) {
             
        }
    }

    public void blue() {
        try {
            Runtime.getRuntime().exec("fsquirt");
        } catch (IOException e) {
             
        }
    }

    public void cmd() {
        try {
            Runtime.getRuntime().exec("cmd /c start cmd");
        } catch (IOException e) {
             
        }
    }

    public void ftp() {
        try {
            Runtime.getRuntime().exec("cmd /c start ftp");
        } catch (IOException e) {
             
        }
    }

    public void paint() {
        try {
            Runtime.getRuntime().exec("mspaint.exe");
        } catch (IOException e) {
             
        }
    }

    public void key() {
        try {
            Runtime.getRuntime().exec("cmd /c start C:\\Windows\\system32\\osk.exe");
        } catch (IOException e) {
             
        }
    }

    public void snip() {
        try {
            Runtime.getRuntime().exec("cmd /c SnippingTool.exe");
        } catch (IOException e) {
             
        }
    }

    public void record() {
        try {
            Runtime.getRuntime().exec("SoundRecorder");
        } catch (IOException e) {
             
        }
    }

    public void sticky() {
        try {
            Runtime.getRuntime().exec("StikyNot");
        } catch (IOException e) {
             
        }
    }

    public void task() {
        try {
            Runtime.getRuntime().exec("taskmgr");
        } catch (IOException e) {
             
        }
    }

    public void file() {
        try {
            Runtime.getRuntime().exec("explorer");
        } catch (IOException e) {
             
        }
    }

    public void foxit() {
        try {
            Runtime.getRuntime().exec("C:\\Program Files (x86)\\Foxit Software\\Foxit Reader\\FOXITREADER.EXE");
        } catch (IOException e) {
             
        }
    }

    public void down() {
        try {
            String[] s = {"explorer", "C:\\Users\\MARTINS\\Downloads"};
            Runtime.getRuntime().exec(s);
        } catch (IOException e) {
             
        }
    }

    public void shutdown() {
        try {
            Runtime.getRuntime().exec("cmd /c shutdown /s /t 0");
        } catch (IOException e) {
             
        }
    }

    public void restart() {
        try {
            Runtime.getRuntime().exec("cmd /c shutdown /r /t 0");
        } catch (IOException e) {
             
        }
    }

    public void hibernate() {
        try {
            Runtime.getRuntime().exec("cmd /c shutdown /h");
        } catch (IOException e) {
             
        }
    }

    public void hide(JFrame fr) {
        fr.setState(Frame.ICONIFIED);
    }

    public void exit(JFrame fr) {
       // fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.dispose();
        
    }

    public void cls(JTextArea view) {
        view.setText("MCode Interpreter v1.1.2\r\nCopyright \u00A9 2018 Martins Anerua. All rights reserved.\r\n\r\nType 'help' to see a list of all commands.\r\n\r");
    }

    public void config(JTextArea v) {
        ConfigUI conf = new ConfigUI(v);
        conf.setVisible(true);
    }

    public void date(JTextArea view) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        view.append("\n\n" + "	" + dateFormat.format(date) + "		" + "\n");
    }

    public void time(JTextArea view) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        view.append("\n\n" + "	" + dateFormat.format(date) + "		" + "\n");
    }

    public void pers() {
        try {
            String[] s = {"explorer", "C:\\Users\\MARTINS\\Documents\\Texts\\Matan"};
            Runtime.getRuntime().exec(s);
        } catch (IOException e) {
             
        }
    }

    public void comp() {
        try {
            String[] s = {"explorer", "C:\\Users\\MARTINS\\Documents\\Texts\\Elect\\Soft"};
            Runtime.getRuntime().exec(s);
        } catch (IOException e) {
             
        }
    }

    public void off(String argue, JTextArea view) {
        switch (argue) {
            case "":
                try {
                    String[] s = {"explorer", "C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Microsoft Office"};
                    Runtime.getRuntime().exec(s);
                } catch (IOException e) {
                     
                }
                break;
            case "a":
                try {
                    Runtime.getRuntime().exec("C:\\Program Files\\Microsoft Office\\Office12\\MSACCESS.EXE");
                } catch (IOException e) {
                     
                }
                break;
            case "e":
                try {
                    Runtime.getRuntime().exec("C:\\Program Files\\Microsoft Office\\Office12\\EXCEL.EXE");
                } catch (IOException e) {
                     
                }
                break;
            case "i":
                try {
                    Runtime.getRuntime().exec("C:\\Program Files\\Microsoft Office\\Office12\\INFOPATH.exe");
                } catch (IOException e) {
                     
                }
                break;
            case "o":
                try {
                    Runtime.getRuntime().exec("C:\\Program Files\\Microsoft Office\\Office12\\OUTLOOK.EXE");
                } catch (IOException e) {
                     
                }
                break;
            case "pp":
                try {
                    Runtime.getRuntime().exec("C:\\Program Files\\Microsoft Office\\Office12\\POWERPNT.EXE");
                } catch (IOException e) {
                     
                }
                break;
            case "p":
                try {
                    Runtime.getRuntime().exec("C:\\Program Files\\Microsoft Office\\Office12\\MSPUB.EXE");
                } catch (IOException e) {
                     
                }
                break;
            case "w":
                try {
                    Runtime.getRuntime().exec("C:\\Program Files\\Microsoft Office\\Office12\\WINWORD.EXE");
                } catch (IOException e) {
                     
                }
                break;
            default:
                view.append("\n -" + argue + " is an illegal argument of the command");
                break;
        }
    }
    
    public void matlab() {
        try {
            Runtime.getRuntime().exec("C:\\Program Files (x86)\\MATLAB\\R2013a\\bin\\win32\\MATLAB.exe");
        } catch (IOException e) {
             
        }
    }
    
    public void bluestacks() {
        try {
            Runtime.getRuntime().exec("C:\\ProgramData\\BlueStacks\\Client\\Bluestacks");
        } catch (IOException e) {
             
        }
    }
    
    public void cavaj() {
        try {
            Runtime.getRuntime().exec("C:\\Program Files (x86)\\Cavaj Java Decompiler\\cavaj.exe");
        } catch (IOException e) {
             
        }
    }
    
    public void html() {
        try {
            Runtime.getRuntime().exec("C:\\Program Files (x86)\\Chami\\HTML-Kit\\Bin\\HTMLKit.exe");
        } catch (IOException e) {
             
        }
    }
    
    public void rar() {
        try {
            Runtime.getRuntime().exec("C:\\Program Files (x86)\\WinRAR\\WinRAR.exe");
        } catch (IOException e) {
             
        }
    }
    
    public void photoshop() {
        try {
            Runtime.getRuntime().exec("C:\\Program Files (x86)\\Photoshop CS6\\Photoshop.exe");
        } catch (IOException e) {
             
        }
    }
    
    public void electric() {
        try {
            Runtime.getRuntime().exec("C:\\Program Files (x86)\\Electric\\electric-9.07.jar");
        } catch (IOException e) {
             
        }
    }
}
