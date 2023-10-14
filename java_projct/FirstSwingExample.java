import javax.swing.*;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class FirstSwingExample {
    Desktop desk = Desktop.getDesktop();

    public static void main(String[] args) {

        JFrame f = new JFrame("Recipe Book");// creating instance of JFrame
        f.getContentPane().setBackground(Color.decode("#85efff"));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(460, 500);// 460 width and 500 height
        f.setLayout(null);// using no layout managers
        f.setResizable(false);

        // --------------------- ADDING TOPP
        // BUTTONS----------------------------------------------------

        JButton breakfast = new JButton("BREAK");
        breakfast.setBounds(10, 3, 100, 40);
        f.add(breakfast);
        breakfast.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                breakfast.setBackground(Color.decode("#ff9ee0"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                breakfast.setBackground(UIManager.getColor("control"));
            }
        });

        // -------openning window of
        // beakfast--------------------------------------------------------------
        breakfast.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame breakfastFrame = new JFrame("Breakfast");
                breakfastFrame.getContentPane().setBackground(Color.decode("#85efff"));
                breakfastFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                breakfastFrame.setSize(460, 550);// 400 width and 500 height
                breakfastFrame.setLayout(null);// using no layout managers
                breakfastFrame.setResizable(false);
                f.setVisible(false);

                JButton breakfast_item1 = new JButton(new ImageIcon("Dosa.png"));
                breakfast_item1.setBounds(5, 0, 450, 113);
                breakfast_item1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Define the URL you want to open
                        String url = "https://youtu.be/KPFAAjONfmk?si=epkT76TI9GC21oBS";

                        try {
                            // Create a URI object from the URL string
                            URI uri = new URI(url);

                            // Check if the Desktop class is supported (works on Windows, macOS, and Linux)
                            if (Desktop.isDesktopSupported()) {
                                Desktop desktop = Desktop.getDesktop();

                                // Check if the browser is supported (not all platforms have a registered
                                // browser)
                                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                                    // Open the URL in the default web browser
                                    desktop.browse(uri);
                                } else {
                                    System.out.println("No browser support");
                                }
                            } else {
                                System.out.println("Desktop not supported");
                            }
                        } catch (IOException | URISyntaxException ex) {
                            ex.printStackTrace();
                        }
                    }
                });

                breakfastFrame.add(breakfast_item1);

                JButton breakfast_item2 = new JButton(new ImageIcon("upma.png"));
                breakfast_item2.setBounds(5, 115, 450, 113);
                breakfast_item2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Define the URL you want to open
                        String url = "https://youtu.be/cAoYsLXUKGI?si=nnocG-FKp4-GNUF-";

                        try {
                            // Create a URI object from the URL string
                            URI uri = new URI(url);

                            // Check if the Desktop class is supported (works on Windows, macOS, and Linux)
                            if (Desktop.isDesktopSupported()) {
                                Desktop desktop = Desktop.getDesktop();

                                // Check if the browser is supported (not all platforms have a registered
                                // browser)
                                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                                    // Open the URL in the default web browser
                                    desktop.browse(uri);
                                } else {
                                    System.out.println("No browser support");
                                }
                            } else {
                                System.out.println("Desktop not supported");
                            }
                        } catch (IOException | URISyntaxException ex) {
                            ex.printStackTrace();
                        }
                    }
                });

                breakfastFrame.add(breakfast_item2);

                JButton breakfast_item3 = new JButton(new ImageIcon("pohe.png"));
                breakfast_item3.setBounds(5, 231, 450, 113);
                breakfast_item3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Define the URL you want to open
                        String url = "https://youtu.be/2_BkfGRcx3o?si=CITOowAO7CC-4roT";

                        try {
                            // Create a URI object from the URL string
                            URI uri = new URI(url);

                            // Check if the Desktop class is supported (works on Windows, macOS, and Linux)
                            if (Desktop.isDesktopSupported()) {
                                Desktop desktop = Desktop.getDesktop();

                                // Check if the browser is supported (not all platforms have a registered
                                // browser)
                                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                                    // Open the URL in the default web browser
                                    desktop.browse(uri);
                                } else {
                                    System.out.println("No browser support");
                                }
                            } else {
                                System.out.println("Desktop not supported");
                            }
                        } catch (IOException | URISyntaxException ex) {
                            ex.printStackTrace();
                        }
                    }
                });

                breakfastFrame.add(breakfast_item3);

                JButton breakfast_item4 = new JButton(new ImageIcon("dhokla.png"));
                breakfast_item4.setBounds(5, 346, 450, 113);
                breakfast_item4.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Define the URL you want to open
                        String url = "https://youtu.be/w_2eb9uaXns?si=S8eLhW1oF_hOh4Sq";

                        try {
                            // Create a URI object from the URL string
                            URI uri = new URI(url);

                            // Check if the Desktop class is supported (works on Windows, macOS, and Linux)
                            if (Desktop.isDesktopSupported()) {
                                Desktop desktop = Desktop.getDesktop();

                                // Check if the browser is supported (not all platforms have a registered
                                // browser)
                                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                                    // Open the URL in the default web browser
                                    desktop.browse(uri);
                                } else {
                                    System.out.println("No browser support");
                                }
                            } else {
                                System.out.println("Desktop not supported");
                            }
                        } catch (IOException | URISyntaxException ex) {
                            ex.printStackTrace();
                        }
                    }
                });

                breakfastFrame.add(breakfast_item4);
                JButton back = new JButton("BACK");
                back.setBounds(2, 462, 453, 48);
                breakfastFrame.add(back);
                back.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        f.setVisible(true);
                        breakfastFrame.setVisible(false);
                    }
                });
                breakfastFrame.setVisible(true);
            }

        });

        // ---------------------------lunch
        // button----------------------------------------------------------

        JButton lunch = new JButton("Lunch");
        lunch.setBounds(120, 3, 100, 40);
        f.add(lunch);
        lunch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lunch.setBackground(Color.decode("#ff9ee0"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                lunch.setBackground(UIManager.getColor("control"));
            }
        });

        // ------------------------- CREATING WINDOWS FOR LUNCH
        // ------------------------------------------------

        lunch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame lunchFrame = new JFrame("Lunch");
                lunchFrame.getContentPane().setBackground(Color.decode("#85efff"));
                lunchFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                lunchFrame.setSize(460, 550);// 400 width and 500 height
                lunchFrame.setLayout(null);// using no layout managers
                lunchFrame.setResizable(false);
                f.setVisible(false);

                JButton lunch_item1 = new JButton(new ImageIcon("dalkhichdi.png"));
                lunch_item1.setBounds(5, 0, 450, 113);
                lunch_item1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Define the URL you want to open
                        String url = "https://youtu.be/SYWtizV5oCI?si=3AEt3vog1f1x8Yrx";

                        try {
                            // Create a URI object from the URL string
                            URI uri = new URI(url);

                            // Check if the Desktop class is supported (works on Windows, macOS, and Linux)
                            if (Desktop.isDesktopSupported()) {
                                Desktop desktop = Desktop.getDesktop();

                                // Check if the browser is supported (not all platforms have a registered
                                // browser)
                                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                                    // Open the URL in the default web browser
                                    desktop.browse(uri);
                                } else {
                                    System.out.println("No browser support");
                                }
                            } else {
                                System.out.println("Desktop not supported");
                            }
                        } catch (IOException | URISyntaxException ex) {
                            ex.printStackTrace();
                        }
                    }
                });

                lunchFrame.add(lunch_item1);

                JButton lunch_item2 = new JButton(new ImageIcon("noodles.png"));
                lunch_item2.setBounds(5, 115, 450, 113);
                lunch_item2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Define the URL you want to open
                        String url = "https://youtu.be/u3vuq3zaR20?si=NPU8eDJ87kn-1j2p";

                        try {
                            // Create a URI object from the URL string
                            URI uri = new URI(url);

                            // Check if the Desktop class is supported (works on Windows, macOS, and Linux)
                            if (Desktop.isDesktopSupported()) {
                                Desktop desktop = Desktop.getDesktop();

                                // Check if the browser is supported (not all platforms have a registered
                                // browser)
                                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                                    // Open the URL in the default web browser
                                    desktop.browse(uri);
                                } else {
                                    System.out.println("No browser support");
                                }
                            } else {
                                System.out.println("Desktop not supported");
                            }
                        } catch (IOException | URISyntaxException ex) {
                            ex.printStackTrace();
                        }
                    }
                });

                lunchFrame.add(lunch_item2);

                JButton lunch_item3 = new JButton(new ImageIcon("momos.png"));
                lunch_item3.setBounds(5, 231, 450, 113);
                lunch_item3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Define the URL you want to open
                        String url = "https://youtu.be/UsIoJ9TzISU?si=_n5osZvZd4UNxU74";

                        try {
                            // Create a URI object from the URL string
                            URI uri = new URI(url);

                            // Check if the Desktop class is supported (works on Windows, macOS, and Linux)
                            if (Desktop.isDesktopSupported()) {
                                Desktop desktop = Desktop.getDesktop();

                                // Check if the browser is supported (not all platforms have a registered
                                // browser)
                                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                                    // Open the URL in the default web browser
                                    desktop.browse(uri);
                                } else {
                                    System.out.println("No browser support");
                                }
                            } else {
                                System.out.println("Desktop not supported");
                            }
                        } catch (IOException | URISyntaxException ex) {
                            ex.printStackTrace();
                        }
                    }
                });

                lunchFrame.add(lunch_item3);

                JButton lunch_item4 = new JButton(new ImageIcon("pavbhaji.png"));
                lunch_item4.setBounds(5, 346, 450, 113);
                lunch_item4.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Define the URL you want to open
                        String url = "https://youtu.be/sAnPUIvPc1I?si=vfC768AvNucVO3GC";

                        try {
                            // Create a URI object from the URL string
                            URI uri = new URI(url);

                            // Check if the Desktop class is supported (works on Windows, macOS, and Linux)
                            if (Desktop.isDesktopSupported()) {
                                Desktop desktop = Desktop.getDesktop();

                                // Check if the browser is supported (not all platforms have a registered
                                // browser)
                                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                                    // Open the URL in the default web browser
                                    desktop.browse(uri);
                                } else {
                                    System.out.println("No browser support");
                                }
                            } else {
                                System.out.println("Desktop not supported");
                            }
                        } catch (IOException | URISyntaxException ex) {
                            ex.printStackTrace();
                        }
                    }
                });

                lunchFrame.add(lunch_item4);
                JButton back = new JButton("BACK");
                back.setBounds(2, 462, 453, 48);
                lunchFrame.add(back);
                back.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        f.setVisible(true);
                        lunchFrame.setVisible(false);
                    }
                });
                

                lunchFrame.setVisible(true);
            }

        });

        // --------------------------dinner--------------------------------------------------------------

        JButton dinner = new JButton("Dinner");
        dinner.setBounds(230, 3, 100, 40);
        f.add(dinner);
        dinner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dinner.setBackground(Color.decode("#ff9ee0"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                dinner.setBackground(UIManager.getColor("control"));
            }
        });

        // ----------------CREATNG WINDOW FOR
        // DINNER----------------------------------------------------------

        dinner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame dinnerframe = new JFrame("DINNER");
                dinnerframe.getContentPane().setBackground(Color.decode("#85efff"));
                dinnerframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dinnerframe.setSize(460, 550);// 400 width and 500 height
                dinnerframe.setLayout(null);// using no layout managers
                dinnerframe.setResizable(false);
                f.setVisible(false);
                JButton dinner_item1 = new JButton(new ImageIcon("rajma.png"));
                dinner_item1.setBounds(5, 0, 450, 113);
                dinner_item1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Define the URL you want to open
                        String url = "https://youtu.be/M_ncAJhIaIU?si=Wke98KhCRslVRiec";

                        try {
                            // Create a URI object from the URL string
                            URI uri = new URI(url);

                            // Check if the Desktop class is supported (works on Windows, macOS, and Linux)
                            if (Desktop.isDesktopSupported()) {
                                Desktop desktop = Desktop.getDesktop();

                                // Check if the browser is supported (not all platforms have a registered
                                // browser)
                                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                                    // Open the URL in the default web browser
                                    desktop.browse(uri);
                                } else {
                                    System.out.println("No browser support");
                                }
                            } else {
                                System.out.println("Desktop not supported");
                            }
                        } catch (IOException | URISyntaxException ex) {
                            ex.printStackTrace();
                        }
                    }
                });

                dinnerframe.add(dinner_item1);

                JButton dinner_item2 = new JButton(new ImageIcon("chickenmasala.png"));
                dinner_item2.setBounds(5, 115, 450, 113);
                dinner_item2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Define the URL you want to open
                        String url = "https://youtu.be/D_fYk8mBaF4?si=Q31siVCjsU5MHGue";

                        try {
                            // Create a URI object from the URL string
                            URI uri = new URI(url);

                            // Check if the Desktop class is supported (works on Windows, macOS, and Linux)
                            if (Desktop.isDesktopSupported()) {
                                Desktop desktop = Desktop.getDesktop();

                                // Check if the browser is supported (not all platforms have a registered
                                // browser)
                                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                                    // Open the URL in the default web browser
                                    desktop.browse(uri);
                                } else {
                                    System.out.println("No browser support");
                                }
                            } else {
                                System.out.println("Desktop not supported");
                            }
                        } catch (IOException | URISyntaxException ex) {
                            ex.printStackTrace();
                        }
                    }
                });
                dinnerframe.add(dinner_item2);

                JButton dinner_item3 = new JButton(new ImageIcon("koffta.png"));
                dinner_item3.setBounds(5, 231, 450, 113);
                dinner_item3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Define the URL you want to open
                        String url = "https://youtu.be/Q4cSiiYa6_w?si=MS_sWK1s0v3_A6IO";

                        try {
                            // Create a URI object from the URL string
                            URI uri = new URI(url);

                            // Check if the Desktop class is supported (works on Windows, macOS, and Linux)
                            if (Desktop.isDesktopSupported()) {
                                Desktop desktop = Desktop.getDesktop();

                                // Check if the browser is supported (not all platforms have a registered
                                // browser)
                                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                                    // Open the URL in the default web browser
                                    desktop.browse(uri);
                                } else {
                                    System.out.println("No browser support");
                                }
                            } else {
                                System.out.println("Desktop not supported");
                            }
                        } catch (IOException | URISyntaxException ex) {
                            ex.printStackTrace();
                        }
                    }
                });
                dinnerframe.add(dinner_item3);

                JButton dinner_item4 = new JButton(new ImageIcon("prawn.png"));
                dinner_item4.setBounds(5, 346, 450, 113);
                dinner_item4.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Define the URL you want to open
                        String url = "https://youtu.be/R8_AZ-fWejM?si=1sF8E25_L3FFIwid";

                        try {
                            // Create a URI object from the URL string
                            URI uri = new URI(url);

                            // Check if the Desktop class is supported (works on Windows, macOS, and Linux)
                            if (Desktop.isDesktopSupported()) {
                                Desktop desktop = Desktop.getDesktop();

                                // Check if the browser is supported (not all platforms have a registered
                                // browser)
                                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                                    // Open the URL in the default web browser
                                    desktop.browse(uri);
                                } else {
                                    System.out.println("No browser support");
                                }
                            } else {
                                System.out.println("Desktop not supported");
                            }
                        } catch (IOException | URISyntaxException ex) {
                            ex.printStackTrace();
                        }
                    }
                });
                dinnerframe.add(dinner_item4);
                JButton back = new JButton("BACK");
                back.setBounds(2, 462, 453, 48);
                dinnerframe.add(back);
                back.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        f.setVisible(true);
                        dinnerframe.setVisible(false);
                    }
                });
                dinnerframe.setVisible(true);
            }

        });

        // -----------------SWEET----------------------------------------------------------------------------------

        JButton sweet = new JButton("Sweet");
        sweet.setBounds(340, 3, 100, 40);
        f.add(sweet);
        sweet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sweet.setBackground(Color.decode("#ff9ee0"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                sweet.setBackground(UIManager.getColor("control"));
            }
        });

        // ----------------------------CREATING WINDOW FOR
        // SWEET-------------------------------------

        sweet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame sweetframe = new JFrame("SWEET");
                sweetframe.getContentPane().setBackground(Color.decode("#85efff"));
                sweetframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                sweetframe.setSize(460, 550);// 400 width and 500 height
                sweetframe.setLayout(null);// using no layout managers
                sweetframe.setResizable(false);
                f.setVisible(false);

                JButton sweet_item1 = new JButton(new ImageIcon("modak.png"));
                sweet_item1.setBounds(5, 0, 450, 113);
                sweet_item1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Define the URL you want to open
                        String url = "https://youtu.be/KcXhD7vAYmo?si=OTTBTVoVM9ToYDzY";

                        try {
                            // Create a URI object from the URL string
                            URI uri = new URI(url);

                            // Check if the Desktop class is supported (works on Windows, macOS, and Linux)
                            if (Desktop.isDesktopSupported()) {
                                Desktop desktop = Desktop.getDesktop();

                                // Check if the browser is supported (not all platforms have a registered
                                // browser)
                                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                                    // Open the URL in the default web browser
                                    desktop.browse(uri);
                                } else {
                                    System.out.println("No browser support");
                                }
                            } else {
                                System.out.println("Desktop not supported");
                            }
                        } catch (IOException | URISyntaxException ex) {
                            ex.printStackTrace();
                        }
                    }
                });
                sweetframe.add(sweet_item1);

                JButton sweet_item2 = new JButton(new ImageIcon("gulabjam.png"));
                sweet_item2.setBounds(5, 115, 450, 113);
                sweet_item2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Define the URL you want to open
                        String url = "https://youtu.be/QFvd7u_YjVk?si=N8vSkHY9KO5iMd_A";

                        try {
                            // Create a URI object from the URL string
                            URI uri = new URI(url);

                            // Check if the Desktop class is supported (works on Windows, macOS, and Linux)
                            if (Desktop.isDesktopSupported()) {
                                Desktop desktop = Desktop.getDesktop();

                                // Check if the browser is supported (not all platforms have a registered
                                // browser)
                                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                                    // Open the URL in the default web browser
                                    desktop.browse(uri);
                                } else {
                                    System.out.println("No browser support");
                                }
                            } else {
                                System.out.println("Desktop not supported");
                            }
                        } catch (IOException | URISyntaxException ex) {
                            ex.printStackTrace();
                        }
                    }
                });
                sweetframe.add(sweet_item2);

                JButton sweet_item3 = new JButton(new ImageIcon("pedaa.png"));
                sweet_item3.setBounds(5, 231, 450, 113);
                sweet_item3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Define the URL you want to open
                        String url = "https://youtu.be/8_o9aIxzRQI?si=LuDHvvOyjUgm0AI1";

                        try {
                            // Create a URI object from the URL string
                            URI uri = new URI(url);

                            // Check if the Desktop class is supported (works on Windows, macOS, and Linux)
                            if (Desktop.isDesktopSupported()) {
                                Desktop desktop = Desktop.getDesktop();

                                // Check if the browser is supported (not all platforms have a registered
                                // browser)
                                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                                    // Open the URL in the default web browser
                                    desktop.browse(uri);
                                } else {
                                    System.out.println("No browser support");
                                }
                            } else {
                                System.out.println("Desktop not supported");
                            }
                        } catch (IOException | URISyntaxException ex) {
                            ex.printStackTrace();
                        }
                    }
                });
                sweetframe.add(sweet_item3);

                JButton sweet_item4 = new JButton(new ImageIcon("rasgulla.png"));
                sweet_item4.setBounds(5, 346, 450, 113);
                sweet_item4.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Define the URL you want to open
                        String url = "https://youtu.be/dd9_YZdQS0c?si=vZfSccKzSQWl_g8N";

                        try {
                            // Create a URI object from the URL string
                            URI uri = new URI(url);

                            // Check if the Desktop class is supported (works on Windows, macOS, and Linux)
                            if (Desktop.isDesktopSupported()) {
                                Desktop desktop = Desktop.getDesktop();

                                // Check if the browser is supported (not all platforms have a registered
                                // browser)
                                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                                    // Open the URL in the default web browser
                                    desktop.browse(uri);
                                } else {
                                    System.out.println("No browser support");
                                }
                            } else {
                                System.out.println("Desktop not supported");
                            }
                        } catch (IOException | URISyntaxException ex) {
                            ex.printStackTrace();
                        }
                    }
                });
                sweetframe.add(sweet_item4);
                JButton back = new JButton("BACK");
                back.setBounds(2, 462, 453, 48);
               
                sweetframe.add(back);
                back.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        f.setVisible(true);
                        sweetframe.setVisible(false);
                    }
                });
                sweetframe.setVisible(true);
            }

        });

        // ------------- CREATING PURANPOLI POPUP banner -------------------------

        JButton banner = new JButton(new ImageIcon("puranpoli.jpg"));
        banner.setBounds(9, 46, 440, 150);
        f.add(banner);
        banner.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Define the URL you want to open
                String url = "https://youtu.be/l7Efb-HjDPU?si=regUWGLVTK5qgwLo";

                try {
                    // Create a URI object from the URL string
                    URI uri = new URI(url);

                    // Check if the Desktop class is supported (works on Windows, macOS, and Linux)
                    if (Desktop.isDesktopSupported()) {
                        Desktop desktop = Desktop.getDesktop();

                        // Check if the browser is supported (not all platforms have a registered
                        // browser)
                        if (desktop.isSupported(Desktop.Action.BROWSE)) {
                            // Open the URL in the default web browser
                            desktop.browse(uri);
                        } else {
                            System.out.println("No browser support");
                        }
                    } else {
                        System.out.println("Desktop not supported");
                    }
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        // -------------label--------
        JLabel l1;
        l1 = new JLabel("Popular Recipes");
        l1.setBounds(5, 199, 200, 30);
        l1.setForeground(Color.BLACK);
        f.add(l1);

        JButton l2;
        l2 = new JButton("See All...");
        l2.setBounds(350, 199, 100, 30);
        l2.setForeground(Color.BLACK);
        l2.setBackground(Color.decode("#ff9ee0"));
        f.add(l2);

        // ----------------creating--------popular dishes---------------

        JButton dumbiryani = new JButton(new ImageIcon(
                "biryani.jpg"));
        dumbiryani.setBounds(5, 239, 146, 214);
        dumbiryani.setBackground(Color.decode("#85efff"));
        dumbiryani.setBorderPainted(false);
        dumbiryani.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Define the URL you want to open
                String url = "https://youtu.be/jjmR9C_X7LY?si=ofs8zgiLyAT4-wFb";

                try {
                    // Create a URI object from the URL string
                    URI uri = new URI(url);

                    // Check if the Desktop class is supported (works on Windows, macOS, and Linux)
                    if (Desktop.isDesktopSupported()) {
                        Desktop desktop = Desktop.getDesktop();

                        // Check if the browser is supported (not all platforms have a registered
                        // browser)
                        if (desktop.isSupported(Desktop.Action.BROWSE)) {
                            // Open the URL in the default web browser
                            desktop.browse(uri);
                        } else {
                            System.out.println("No browser support");
                        }
                    } else {
                        System.out.println("Desktop not supported");
                    }
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });
        f.add(dumbiryani);

        JButton pannertikka = new JButton(new ImageIcon(
                "panner.jpg"));
        pannertikka.setBounds(156, 239, 146, 214);
        pannertikka.setBackground(Color.decode("#85efff"));
        pannertikka.setBorderPainted(false);
        pannertikka.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Define the URL you want to open
                String url = "https://youtu.be/5wbMJFZfBBc?si=eADPpPn9rqgL5_Qt";

                try {
                    // Create a URI object from the URL string
                    URI uri = new URI(url);

                    // Check if the Desktop class is supported (works on Windows, macOS, and Linux)
                    if (Desktop.isDesktopSupported()) {
                        Desktop desktop = Desktop.getDesktop();

                        // Check if the browser is supported (not all platforms have a registered
                        // browser)
                        if (desktop.isSupported(Desktop.Action.BROWSE)) {
                            // Open the URL in the default web browser
                            desktop.browse(uri);
                        } else {
                            System.out.println("No browser support");
                        }
                    } else {
                        System.out.println("Desktop not supported");
                    }
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });
        f.add(pannertikka);

        JButton idli = new JButton(new ImageIcon(
                "idli.jpg"));
        idli.setBounds(308, 239, 146, 214);
        idli.setBackground(Color.decode("#85efff"));
        idli.setBorderPainted(false);
        idli.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Define the URL you want to open
                String url = "https://youtu.be/Ayo80PIb-Qg?si=5CoE9iiT5iS-V_T8";

                try {
                    // Create a URI object from the URL string
                    URI uri = new URI(url);

                    // Check if the Desktop class is supported (works on Windows, macOS, and Linux)
                    if (Desktop.isDesktopSupported()) {
                        Desktop desktop = Desktop.getDesktop();

                        // Check if the browser is supported (not all platforms have a registered
                        // browser)
                        if (desktop.isSupported(Desktop.Action.BROWSE)) {
                            // Open the URL in the default web browser
                            desktop.browse(uri);
                        } else {
                            System.out.println("No browser support");
                        }
                    } else {
                        System.out.println("Desktop not supported");
                    }
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });
        f.add(idli);

        f.setVisible(true);// making the frame visible

    }

}