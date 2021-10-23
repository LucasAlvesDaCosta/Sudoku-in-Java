/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojeto;

import java.util.Scanner;

/**
 *
 * @author Lucas Alves
 */
public class Miniprojeto {


    public static void main(String[] args) {

        int [][] sudoku = new int [9][9];
        
        preDeff(sudoku);
    }
       public static void preDeff(int [][] sudoku){
           int i,j;
           sudoku[0][1] =5;
           sudoku[1][1]=9;
           sudoku[2][1]=1;
           sudoku[2][2] =7;

           sudoku[0][5]=7;
           sudoku[1][4]=4;
           sudoku[1][5]=8;
           sudoku[2][4]=5;

           sudoku[0][7]=6;

              sudoku[4][0]=8;
              sudoku[4][1]=4;
              sudoku[5][2]=9;

              sudoku[3][3]=1;
              sudoku[3][4]=8;
              sudoku[3][5]=9;
              sudoku[5][4]=3;
              sudoku[5][5]=6;

              sudoku[3][6]=7;
              sudoku[4][7]=9;
              sudoku[4][8]=6;

               sudoku[7][0]=9;
               sudoku[8][1]=1;

               sudoku[6][4]=7;
               sudoku[7][3]=8;
               sudoku[7][4]=6;
               sudoku[8][3]=3;
               sudoku[8][4]=9;

               sudoku[6][6]=9;
               sudoku[6][7]=1;
               sudoku[7][7]=5;
               sudoku[8][7]=4;
                              for(i=0;i<9;i++){
                                  int contLine =0;
                                  System.out.println("\n");
                                  for(j=0;j<9;j++){
                                      contLine ++;

                                       if(sudoku[i][j] == 0){
                                           System.out.printf("|_| ");
                                       }else
                                       System.out.printf("|%d| ",sudoku[i][j]);
                                       if(contLine == 3 || contLine == 6 || contLine == 9){
                                           System.out.printf("\t");
                                       }

                                  }
                              }System.out.println("\t\t\n");
                               jogo1(sudoku);
       }
//**********************************************************************************************************************************//
        public static void jogo1(int[][] sudoku){
            System.out.println("\nprimeiro jogo...");
            Scanner ler = new Scanner (System.in);
            int i,j;
                   for(i=0; i<3; i++){
                       System.out.println("\n");
                       for(j=0; j<3; j++){
                           if(sudoku[i][j] == 0){
                              System.out.printf("|_|"); 
                           }else System.out.printf("|%d|",sudoku[i][j]);
                       }
                      
                   }
            
                 System.out.println("\n");
                for(i=0; i<3; i++){
                    for(j=0; j<3; j++){
                        if(sudoku[i][j] <=0){
                            System.out.printf("Digite o valor da posicao [%d][%d]:",i,j);
                            sudoku[i][j] = ler.nextInt();
                        }

                    }
                }  //-----------------------------------------------------------------------------------//       
                          for(i=0; i<3; i++){
                              System.out.println("\n");
                              for(j=0; j<3; j++){
                               System.out.printf("|%d|", sudoku[i][j]);
                               
                               }
                             }   
                                   int ocorrenci =0;
                                   for(i=0; i<3; i++){
                                        int a = sudoku[i][0];
                                        int b = sudoku[i][0];
                                        int c = sudoku [i][0];
                                      for(j=1; j<3; j++){
                                          
                                         if(sudoku[i][j] == a){
                                           ocorrenci ++;
                                         }  
                                             if (b == sudoku[i][j]){
                                               ocorrenci++;
                                             }else
                                               if(c == sudoku[i][j]){
                                                ocorrenci++;
                                               }
                                             
                                       }
                                     }
                                     System.out.println("\nNum. repetidos: "+ocorrenci); 
                          if(ocorrenci >1) {
                              System.out.println("\nNumeros repetidos... jogo incorreto");
                          }else {
                                 System.out.println("\njogo correto!!");
                                }
                             
                jogo2(sudoku);
        }
//______________________________________________________________________________________________________________________//
          public static void jogo2(int[][] sudoku){
               System.out.println("\njogo 2...");
               Scanner ler = new Scanner (System.in);
                 int i,j;
                 for(i=3; i<6; i++){
                       System.out.println("\n");
                       for(j=0; j<3; j++){
                           if(sudoku[i][j] == 0){
                              System.out.printf("|_|"); 
                           }else System.out.printf("|%d|",sudoku[i][j]);
                       }
                      
                   }
            
                 System.out.println("\n");
            
                for(i=3; i<6; i++){
                    for(j=0; j<3; j++){
                        if(sudoku[i][j] <=0){
                            System.out.printf("Digite o valor da posicao [%d][%d]:",i,j);
                            sudoku[i][j] = ler.nextInt();
                        }

                    }
                } //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//              
                                           for(i=3; i<6; i++){
                                             System.out.println("\n");
                                             for(j=0; j<3; j++){
                                               System.out.printf("|%d|", sudoku[i][j]);
                               
                                              }
                                            }   
                                   int ocorrenci =0;
                                   for(i=3; i<6; i++){
                                        int a = sudoku[i][0];
                                        int b = sudoku[i][0];
                                        int c = sudoku [i][0];
                                      for(j=1; j<3; j++){
                                          
                                         if(sudoku[i][j] == a){
                                           ocorrenci ++;
                                         }  
                                             if (b == sudoku[i][j]){
                                               ocorrenci++;
                                             }else
                                               if(c == sudoku[i][j]){
                                                ocorrenci++;
                                               }
                                             
                                       }
                                     }
                                     System.out.println("\nNum. repetidos: "+ocorrenci); 
                          if(ocorrenci >1) {
                              System.out.println("\nNumeros repetidos... jogo incorreto");
                          }else {
                                 System.out.println("\njogo correto!!");
                                }

                jogo3(sudoku);
         }
    //####################################################################################################################//

              public static void jogo3(int[][] sudoku){
               System.out.println("\njogo 3...");
                Scanner ler = new Scanner (System.in);
                  int i,j;
                   for(i=6; i<9; i++){
                        System.out.println("\n");
                        for(j=0; j<3; j++){
                            if(sudoku[i][j] == 0){
                               System.out.printf("|_|"); 
                            }else System.out.printf("|%d|",sudoku[i][j]);
                        }
                      
                    }
            
                 System.out.println("\n");
                for(i=6; i<9; i++){
                    for(j=0; j<3; j++){
                        if(sudoku[i][j] <=0){
                            System.out.printf("Digite o valor da posicao [%d][%d]:",i,j);
                            sudoku[i][j] = ler.nextInt();
                        }

                    }
                }//*****************************************************************************************//
                                           for(i=6; i<9; i++){
                                             System.out.println("\n");
                                             for(j=0; j<3; j++){
                                               System.out.printf("|%d|", sudoku[i][j]);
                               
                                              }
                                            }   
                                   int ocorrenci =0;
                                   for(i=6; i<9; i++){
                                        int a = sudoku[i][0];
                                        int b = sudoku[i][0];
                                        int c = sudoku [i][0];
                                      for(j=1; j<3; j++){
                                          
                                         if(sudoku[i][j] == a){
                                           ocorrenci ++;
                                         }  
                                             if (b == sudoku[i][j]){
                                               ocorrenci++;
                                             }else
                                               if(c == sudoku[i][j]){
                                                ocorrenci++;
                                               }
                                             
                                       }
                                     }
                                      System.out.println("\nNum. repetidos: "+ocorrenci); 
                          if(ocorrenci >1) {
                              System.out.println("\nNumeros repetidos... jogo incorreto");
                          }else {
                                 System.out.println("\njogo correto!!");
                                }

                  jogo4(sudoku);
             }
//¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨***********************¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨//
                public static void jogo4(int[][] sudoku){
                     System.out.println("\njogo 4...");
                      Scanner ler = new Scanner (System.in);
                       int i,j;
                       for(i=0; i<3; i++){
                          System.out.println("\n");
                            for(j=3; j<6; j++){
                              if(sudoku[i][j] == 0){
                                System.out.printf("|_|"); 
                              }else System.out.printf("|%d|",sudoku[i][j]);
                            }
                      
                        }
            
                 System.out.println("\n");
                   for(i=0; i<3; i++){
                      for(j=3; j<6; j++){
                          if(sudoku[i][j] <=0){
                              System.out.printf("Digite o valor da posicao [%d][%d]:",i,j);
                             sudoku[i][j] = ler.nextInt();
                          }

                       }
                    }//################################################################################//
                                            for(i=0; i<3; i++){
                                             System.out.println("\n");
                                             for(j=3; j<6; j++){
                                               System.out.printf("|%d|", sudoku[i][j]);
                               
                                              }
                                            }   
                                   int ocorrenci =0;
                                   for(i=0; i<3; i++){
                                        int a = sudoku[i][3];
                                        int b = sudoku[i][3];
                                        int c = sudoku [i][3];
                                      for(j=4; j<6; j++){
                                          
                                         if(sudoku[i][j] == a){
                                           ocorrenci ++;
                                         }  
                                             if (b == sudoku[i][j]){
                                               ocorrenci++;
                                             }else
                                               if(c == sudoku[i][j]){
                                                ocorrenci++;
                                               }
                                             
                                       }
                                     }
                                     System.out.println("\nNum. repetidos: "+ocorrenci); 
                          if(ocorrenci >1) {
                              System.out.println("\nNumeros repetidos... jogo incorreto");
                          }else {
                                 System.out.println("\njogo correto!!");
                                }

                     jogo5(sudoku);
                }
       //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
                   public static void jogo5(int[][] sudoku){
                       System.out.println("\njogo 5...");
                        Scanner ler = new Scanner (System.in);
                       int i,j;
                       for(i=3; i<6; i++){
                       System.out.println("\n");
                       for(j=3; j<6; j++){
                           if(sudoku[i][j] == 0){
                              System.out.printf("|_|"); 
                           }else System.out.printf("|%d|",sudoku[i][j]);
                       }
                      
                   }
            
                 System.out.println("\n");
                for(i=3; i<6; i++){
                    for(j=3; j<6; j++){
                        if(sudoku[i][j] <=0){
                            System.out.printf("Digite o valor da posicao [%d][%d]:",i,j);
                            sudoku[i][j] = ler.nextInt();
                        }

                    }
                }//¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨//
                                           for(i=3; i<6; i++){
                                             System.out.println("\n");
                                             for(j=3; j<6; j++){
                                               System.out.printf("|%d|", sudoku[i][j]);
                               
                                              }
                                            }   
                                   int ocorrenci =0;
                                   for(i=3; i<6; i++){
                                        int a = sudoku[i][3];
                                        int b = sudoku[i][3];
                                        int c = sudoku [i][3];
                                      for(j=4; j<6; j++){
                                          
                                         if(sudoku[i][j] == a){
                                           ocorrenci ++;
                                         }  
                                             if (b == sudoku[i][j]){
                                               ocorrenci++;
                                             }else
                                               if(c == sudoku[i][j]){
                                                ocorrenci++;
                                               }
                                             
                                       }
                                     }
                                      System.out.println("\nNum. repetidos: "+ocorrenci); 
                          if(ocorrenci >1) {
                              System.out.println("\nNumeros repetidos... jogo incorreto");
                          }else {
                                 System.out.println("\njogo correto!!");
                                }

                       jogo6(sudoku);
                  }
//...............................................................................................//
                    public static void jogo6(int[][] sudoku){
                        System.out.println("\njogo 6....");
                          Scanner ler = new Scanner (System.in);
                           int i,j;
                           for(i=6; i<9; i++){
                             System.out.println("\n");
                             for(j=3; j<6; j++){
                               if(sudoku[i][j] == 0){
                                System.out.printf("|_|"); 
                               }else System.out.printf("|%d|",sudoku[i][j]);
                             }
                      
                           }
            
                        System.out.println("\n");
                        for(i=6; i<9; i++){
                            for(j=3; j<6; j++){
                               if(sudoku[i][j] <=0){
                                 System.out.printf("Digite o valor da posicao [%d][%d]:",i,j);
                                  sudoku[i][j] = ler.nextInt();
                                }

                             }
                          }//_____________________________________________________________________________________//
                                           for(i=6; i<9; i++){
                                             System.out.println("\n");
                                             for(j=3; j<6; j++){
                                               System.out.printf("|%d|", sudoku[i][j]);
                               
                                              }
                                            }   
                                   int ocorrenci =0;
                                   for(i=6; i<9; i++){
                                        int a = sudoku[i][3];
                                        int b = sudoku[i][3];
                                        int c = sudoku [i][3];
                                      for(j=4; j<6; j++){
                                          
                                         if(sudoku[i][j] == a){
                                           ocorrenci ++;
                                         }  
                                             if (b == sudoku[i][j]){
                                               ocorrenci++;
                                             }else
                                               if(c == sudoku[i][j]){
                                                ocorrenci++;
                                               }
                                             
                                       }
                                     }
                                      System.out.println("\nNum. repetidos: "+ocorrenci); 
                          if(ocorrenci >1) {
                              System.out.println("\nNumeros repetidos... jogo incorreto");
                          }else {
                                 System.out.println("\njogo correto!!");
                                }

                          jogo7(sudoku);
                    }
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://
                     public static void jogo7(int[][] sudoku){
                         System.out.println("\njogo 7...");
                        Scanner ler = new Scanner (System.in);
                            int i,j;
                            for(i=0; i<3; i++){
                                System.out.println("\n");
                                for(j=6; j<9; j++){
                                    if(sudoku[i][j] == 0){
                                      System.out.printf("|_|"); 
                                    }else System.out.printf("|%d|",sudoku[i][j]);
                                }
                      
                            }
            
                        System.out.println("\n");
                        for(i=0; i<3; i++){
                          for(j=6; j<9; j++){
                             if(sudoku[i][j] <=0){
                                 System.out.printf("Digite o valor da posicao [%d][%d]:",i,j);
                                 sudoku[i][j] = ler.nextInt();
                              }

                           }
                         }//-------------------------------------------------------------------------------//
                                           for(i=0; i<3; i++){
                                             System.out.println("\n");
                                             for(j=6; j<9; j++){
                                               System.out.printf("|%d|", sudoku[i][j]);
                               
                                              }
                                            }   
                                   int ocorrenci =0;
                                   for(i=0; i<3; i++){
                                        int a = sudoku[i][6];
                                        int b = sudoku[i][6];
                                        int c = sudoku [i][6];
                                      for(j=7; j<9; j++){
                                          
                                         if(sudoku[i][j] == a){
                                           ocorrenci ++;
                                         }  
                                             if (b == sudoku[i][j]){
                                               ocorrenci++;
                                             }else
                                               if(c == sudoku[i][j]){
                                                ocorrenci++;
                                               }
                                             
                                       }
                                     }
                                      System.out.println("\nNum. repetidos: "+ocorrenci); 
                          if(ocorrenci >1) {
                              System.out.println("\nNumeros repetidos... jogo incorreto");
                          }else {
                                 System.out.println("\njogo correto!!");
                                }
                               

                         jogo8(sudoku);
                     }
//o0o0oo0o0o0o0o0o0o0o0o0o0o0o0o0o0o0o0o0o0o0o0o0o0o0o0o0o0o0o0o0o0o0o0o0o0o0o0o0oo0o0o0o0o0o0o0o0o0o0//
                      public static void jogo8(int[][] sudoku){
                          System.out.println("\njogo 8...");
                        Scanner ler = new Scanner (System.in);
                              int i,j;
                              for(i=3; i<6; i++){
                               System.out.println("\n");
                                 for(j=6; j<9; j++){
                                    if(sudoku[i][j] == 0){
                                      System.out.printf("|_|"); 
                                    }else System.out.printf("|%d|",sudoku[i][j]);
                                  }
                      
                              }
            
                 System.out.println("\n");
                          for(i=3; i<6; i++){
                            for(j=6; j<9; j++){
                               if(sudoku[i][j] <=0){
                                System.out.printf("Digite o valor da posicao [%d][%d]:",i,j);
                                sudoku[i][j] = ler.nextInt();
                               }

                            }
                         }//======================================================================================//
                                           for(i=3; i<6; i++){
                                             System.out.println("\n");
                                             for(j=6; j<9; j++){
                                               System.out.printf("|%d|", sudoku[i][j]);
                               
                                              }
                                            }   
                                   int ocorrenci =0;
                                   for(i=3; i<6; i++){
                                        int a = sudoku[i][6];
                                        int b = sudoku[i][6];
                                        int c = sudoku [i][6];
                                      for(j=7; j<9; j++){
                                          
                                         if(sudoku[i][j] == a){
                                           ocorrenci ++;
                                         }  
                                             if (b == sudoku[i][j]){
                                               ocorrenci++;
                                             }else
                                               if(c == sudoku[i][j]){
                                                ocorrenci++;
                                               }
                                             
                                       }
                                     }
                                      System.out.println("\nNum. repetidos: "+ocorrenci);  
                          if(ocorrenci >1) {
                              System.out.println("\nNumeros repetidos... jogo incorreto");
                          }else {
                                 System.out.println("\njogo correto!!");
                                }

                          jogo9(sudoku);
                      }
//#####################################@@@@@@@@@@@@@@@@@@@@@@################################################################//
                        public static void jogo9(int[][] sudoku){
                            System.out.println("\njogo 9...\tULTIMO");
                        Scanner ler = new Scanner (System.in);
                           int i,j;
                             for(i=6; i<9; i++){
                             System.out.println("\n");
                                for(j=6; j<9; j++){
                                   if(sudoku[i][j] == 0){
                                     System.out.printf("|_|"); 
                                   }else System.out.printf("|%d|",sudoku[i][j]);
                                }
                      
                             }
            
                         System.out.println("\n");
                         for(i=6; i<9; i++){
                            for(j=6; j<9; j++){
                               if(sudoku[i][j] <=0){
                                System.out.printf("Digite o valor da posicao [%d][%d]:",i,j);
                                sudoku[i][j] = ler.nextInt();
                               }

                            }
                          }//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<//
                         
                                           for(i=6; i<9; i++){
                                             System.out.println("\n");
                                             for(j=6; j<9; j++){
                                               System.out.printf("|%d|", sudoku[i][j]);
                               
                                              }
                                            }   
                                   int ocorrenci =0;
                                   for(i=6; i<9; i++){
                                        int a = sudoku[i][6];
                                        int b = sudoku[i][6];
                                        int c = sudoku[i][6];
                                      for(j=7; j<9; j++){
                                          
                                         if(sudoku[i][j] == a){
                                           ocorrenci ++;
                                         }  
                                             if (b == sudoku[i][j]){
                                               ocorrenci++;
                                             }else
                                               if(c == sudoku[i][j]){
                                                ocorrenci++;
                                               }
                                             
                                       }
                                     }
                                      System.out.println("\nNum. repetidos: "+ocorrenci);  
                          if(ocorrenci >1) {
                              System.out.println("\nNumeros repetidos... jogo incorreto");
                          }else {
                                 System.out.println("\njogo correto!!");
                                }


                       }




}
