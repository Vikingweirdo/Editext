package com.example.asus.game;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private Button but1 = null;
    private Button but2 = null;
    private Button but3 = null;
    private Button but4 = null;
    private Button but5 = null;
    private Button but6 = null;
    private Button but7 = null;
    private Button but8 = null;
    private Button but9 = null;
    private TextView txt = null;
    private boolean flag = false;
    private char B[][];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        B = new char[3][3];
        this.but1 = (Button) super.findViewById(R.id.bt1);
        this.but2 = (Button) super.findViewById(R.id.bt2);
        this.but3 = (Button) super.findViewById(R.id.bt3);
        this.but4 = (Button) super.findViewById(R.id.bt4);
        this.but5 = (Button) super.findViewById(R.id.bt5);
        this.but6 = (Button) super.findViewById(R.id.bt6);
        this.but7 = (Button) super.findViewById(R.id.bt7);
        this.but8 = (Button) super.findViewById(R.id.bt8);
        this.but9 = (Button) super.findViewById(R.id.bt9);
        this.txt = (TextView) super.findViewById(R.id.result);

        but1.setOnClickListener(new OnTouch1());
        but2.setOnClickListener(new OnTouch2());
        but3.setOnClickListener(new OnTouch3());
        but4.setOnClickListener(new OnTouch4());
        but5.setOnClickListener(new OnTouch5());
        but6.setOnClickListener(new OnTouch6());
        but7.setOnClickListener(new OnTouch7());
        but8.setOnClickListener(new OnTouch8());
        but9.setOnClickListener(new OnTouch9());

        init();

    }

    public void check() {

        if (B[0][0] == 'X' && B[1][0] == 'X') {
            but7.setText('O');
            B[2][0] = 'O';
            flag = false;
        } else if (B[1][0] == 'X' && B[2][0] == 'X') {
            but1.setText('O');
            B[0][0] = 'O';
            flag = false;
        } else if (B[0][1] == 'X' && B[1][1] == 'X') {
            but8.setText('O');
            B[2][1] = 'O';
            flag = false;
        } else if (B[1][1] == 'X' && B[2][1] == 'X') {
            but2.setText('O');
            B[0][1] = 'O';
            flag = false;
        } else if (B[0][2] == 'X' && B[1][2] == 'X') {
            but9.setText('O');
            B[2][2] = 'O';
            flag = false;
        } else if (B[1][2] == 'X' && B[2][2] == 'X') {
            but3.setText('O');
            B[0][2] = 'O';
            flag = false;
        } else if (B[0][0] == 'X' && B[1][1] == 'X') {
            but9.setText('O');
            B[2][2] = 'O';
            flag = false;
        } else if (B[1][1] == 'X' && B[2][2] == 'X') {
            but1.setText('O');
            B[0][0] = 'O';
            flag = false;
        } else if (B[0][2] == 'X' && B[1][1] == 'X') {
            but7.setText('O');
            B[2][0] = 'O';
            flag = false;
        } else if (B[1][1] == 'X' && B[2][0] == 'X') {
            but3.setText('O');
            B[0][2] = 'O';
            flag = false;
        } else if (B[0][1] == 'X' && B[0][2] == 'X') {
            but1.setText('O');
            B[0][0] = 'O';
            flag = false;
        } else if (B[0][0] == 'X' && B[0][1] == 'X') {
            but3.setText('O');
            B[0][2] = 'O';
            flag = false;
        } else if (B[1][0] == 'X' && B[1][1] == 'X') {
            but6.setText('O');
            B[1][2] = 'O';
            flag = false;
        } else if (B[1][1] == 'X' && B[1][2] == 'X') {
            but4.setText('O');
            B[1][0] = 'O';
            flag = false;
        } else if (B[2][0] == 'X' && B[2][1] == 'X') {
            but9.setText('O');
            B[2][2] = 'O';
            flag = false;
        } else if (B[2][1] == 'X' && B[2][2] == 'X') {
            but7.setText('O');
            B[2][1] = 'O';
            flag = false;
        } else if (B[0][0] == 'X' && B[0][1] == 'X') {
            but2.setText('O');
            B[0][1] = 'O';
            flag = false;
        } else if (B[0][0] == 'X' && B[2][2] == 'X') {
            but5.setText('O');
            B[1][1] = 'O';
            flag = false;
        } else if (B[0][0] == 'X' && B[2][0] == 'X') {
            but4.setText('O');
            B[1][0] = 'O';
            flag = false;
        } else if (B[0][1] == 'X' && B[2][1] == 'X') {
            but5.setText('O');
            B[1][1] = 'O';
            flag = false;
        } else if (B[0][2] == 'X' && B[2][2] == 'X') {
            but6.setText('O');
            B[1][2] = 'O';
            flag = false;
        } else if (B[1][0] == 'X' && B[1][2] == 'X') {
            but5.setText('O');
            B[1][1] = 'O';
            flag = false;
        } else if (B[2][0] == 'X' && B[2][2] == 'X') {
            but8.setText('O');
            B[2][1] = 'O';
            flag = false;
        } else if (B[0][2] == 'X' && B[2][0] == 'X') {
            but5.setText('O');
            B[1][1] = 'O';
            flag = false;
        }


    }


    public void Result() {
        if (B[0][0] == 'X' && B[0][1] == 'X' && B[0][2] == 'X') {
            txt.setText("YOU WIN");
        } else if (B[0][0] == 'X' && B[1][1] == 'X' && B[2][2] == 'X') {
            txt.setText("YOU WIN");
        } else if (B[0][0] == 'X' && B[1][0] == 'X' && B[2][0] == 'X') {
            txt.setText("YOU WIN");
        } else if (B[2][0] == 'X' && B[2][1] == 'X' && B[2][2] == 'X') {
            txt.setText("YOU WIN");
        } else if (B[1][0] == 'X' && B[1][1] == 'X' && B[1][2] == 'X') {
            txt.setText("YOU WIN");
        } else if (B[0][1] == 'X' && B[1][1] == 'X' && B[2][1] == 'X') {
            txt.setText("YOU WIN");
        } else if (B[0][2] == 'X' && B[1][2] == 'X' && B[2][2] == 'X') {
            txt.setText("YOU WIN");
        } else if (B[0][2] == 'X' && B[1][1] == 'X' && B[2][0] == 'X') {
            txt.setText("YOU WIN");
        } else if (B[0][0] == 'X' && B[0][1] == 'X' && B[0][2] == 'X') {
            txt.setText("YOU WIN");
        }

        if (B[0][0] == 'O' && B[1][1] == 'O' && B[2][2] == 'O') {
            txt.setText("YOU LOSS");
        } else if (B[0][0] == 'O' && B[1][0] == 'O' && B[2][0] == 'O') {
            txt.setText("YOU LOSS");
        } else if (B[2][0] == 'O' && B[2][1] == 'O' && B[2][2] == 'O') {
            txt.setText("YOU LOSS");
        } else if (B[1][0] == 'O' && B[1][1] == 'O' && B[1][2] == 'O') {
            txt.setText("YOU LOSS");
        } else if (B[0][1] == 'O' && B[1][1] == 'O' && B[2][1] == 'O') {
            txt.setText("YOU LOSS");
        } else if (B[0][2] == 'O' && B[1][2] == 'O' && B[2][2] == 'O') {
            txt.setText("YOU LOSS");
        } else if (B[0][2] == 'O' && B[1][1] == 'O' && B[2][0] == 'O') {
            txt.setText("YOU LOSS");
        } else if (B[0][0] == 'O' && B[0][1] == 'O' && B[0][2] == 'O') {
            txt.setText("YOU LOSS");
        }
    }

    public void init() {
        int i, j;
        for (i = 0; i < 3; i++) {

            for (j = 0; j < 3; j++) {

                B[i][j] = ' ';
            }
        }

    }


    private class OnTouch1 implements OnClickListener {

        public void onClick(View view) {
            but1.setText("X");
            B[0][0] = 'X';
            flag = true;

            if (B[0][0] == 'X' && B[1][0] == 'X') {
                if (B[2][0] == ' ') {
                    but7.setText('O');
                    B[2][0] = 'O';
                    flag = false;
                }
            } else if (B[0][0] == 'X' && B[1][1] == 'X') {
                if (B[2][2] == ' ') {
                    but9.setText('O');
                    B[2][2] = 'O';
                    flag = false;
                }
            } else if (B[0][0] == 'X' && B[0][1] == 'X') {
                if (B[0][2] == ' ') {
                    but3.setText('O');
                    B[0][2] = 'O';
                    flag = false;
                }
            } else if (B[0][0] == 'X' && B[0][2] == 'X') {
                if (B[0][1] == ' ') {
                    but2.setText('O');
                    B[0][1] = 'O';
                    flag = false;
                }

            } else if (B[0][0] == 'X' && B[2][2] == 'X') {
                if (B[1][1] == ' ') {
                    but5.setText('O');
                    B[1][1] = 'O';
                    flag = false;
                }
            } else if (B[0][0] == 'X' && B[2][0] == 'X') {
                if (B[1][0] == ' ') {
                    but4.setText('O');
                    B[1][0] = 'O';
                    flag = false;
                }
            } else {
                for (int i = 0; i < 3; i++) {

                    for (int j = 0; j < 3; j++) {

                        if (flag && B[i][j] == ' ') {

                            if (i == 0 && j == 1) {
                                but2.setText("O");
                                B[i][j] = 'O';
                                flag = false;

                            } else if (i == 0 && j == 2) {
                                but3.setText("O");
                                B[i][j] = 'O';
                                flag = false;

                            } else if (i == 1 && j == 0) {
                                but4.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 1 && j == 1) {
                                but5.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 1 && j == 2) {
                                but6.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 2 && j == 0) {
                                but7.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 2 && j == 1) {
                                but8.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 2 && j == 2) {
                                but9.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            }
                        }
                    }
                }

            }
            Result();

        }

    }

    private class OnTouch2 implements OnClickListener {

        public void onClick(View view) {
            but2.setText("X");
            B[0][1] = 'X';
            flag = true;
            if (B[0][1] == 'X' && B[0][2] == 'X') {
                if (B[0][0] == ' ') {
                    but1.setText('O');
                    B[0][0] = 'O';
                    flag = false;
                }
            } else if (B[0][1] == 'X' && B[1][1] == 'X') {
                if (B[2][1] == ' ') {
                    but8.setText('O');
                    B[2][1] = 'O';
                    flag = false;
                }
            } else if (B[0][1] == 'X' && B[2][1] == 'X') {
                if (B[1][1] == ' ') {
                    but5.setText('O');
                    B[1][1] = 'O';
                    flag = false;
                }
            } else if (B[0][0] == 'X' && B[0][2] == 'X') {
                if (B[0][1] == ' ') {
                    but2.setText('O');
                    B[0][1] = 'O';
                    flag = false;
                }
            }
            else {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (flag && B[i][j] == ' ') {
                            if (i == 0 && j == 0) {
                                but1.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 0 && j == 2) {
                                but3.setText("O");
                                B[i][j] = 'O';
                                flag = false;

                            } else if (i == 1 && j == 0) {
                                but4.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 1 && j == 1) {
                                but5.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 1 && j == 2) {
                                but6.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 2 && j == 0) {
                                but7.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 2 && j == 1) {
                                but8.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 2 && j == 2) {
                                but9.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            }
                        }
                    }
                }
            }
            Result();
        }
    }

    private class OnTouch3 implements OnClickListener {

        public void onClick(View view) {
            but3.setText("X");
            B[0][2] = 'X';
            flag = true;

            if (B[0][1] == 'X' && B[0][2] == 'X') {
                if (B[0][0] == ' ') {
                    but1.setText('O');
                    B[0][0] = 'O';
                    flag = false;
                }
            } else if (B[0][2] == 'X' && B[1][2] == 'X') {
                if (B[2][2] == ' ') {
                    but9.setText('O');
                    B[2][2] = 'O';
                    flag = false;
                }
            } else if (B[0][2] == 'X' && B[2][0] == 'X') {
                if (B[1][1] == ' ') {
                    but5.setText('O');
                    B[1][1] = 'O';
                    flag = false;
                }
            } else if (B[0][2] == 'X' && B[2][2] == 'X') {
                if (B[1][2] == ' ') {
                    but6.setText('O');
                    B[1][2] = 'O';
                    flag = false;
                }
            } else if (B[0][2]=='X'&&B[0][0]=='X'){
                if (B[0][1]== ' '){
                    but2.setText('O');
                    B[0][1] = 'O';
                    flag = false;
                }
            }

            else {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (flag && B[i][j] == ' ') {
                            if (i == 0 && j == 0) {
                                but1.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 0 && j == 1) {
                                but2.setText("O");
                                B[i][j] = 'O';
                                flag = false;

                            } else if (i == 1 && j == 0) {
                                but4.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 1 && j == 1) {
                                but5.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 1 && j == 2) {
                                but6.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 2 && j == 0) {
                                but7.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 2 && j == 1) {
                                but8.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 2 && j == 2) {
                                but9.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            }
                        }
                    }
                }
            }
            Result();
        }
    }

    private class OnTouch4 implements OnClickListener {

        public void onClick(View view) {

            but4.setText("X");
            B[1][0] = 'X';
            flag = true;


            if (B[1][0] == 'X' && B[0][0] == 'X') {
                if (B[2][0] == ' ') {
                    but7.setText('O');
                    B[2][0] = 'O';
                    flag = false;
                }
            } else if (B[1][0] == 'X' && B[1][1] == 'X') {
                if (B[1][2] == ' ') {
                    but6.setText('O');
                    B[1][2] = 'O';
                    flag = false;
                }
            } else if (B[1][0] == 'X' && B[1][2] == 'X') {
                if (B[1][1] == ' ') {
                    but5.setText('O');
                    B[1][1] = 'O';
                    flag = false;
                }
            } else if (B[1][0] == 'X' && B[2][0] == 'X') {
                if (B[0][0] == ' ') {
                    but1.setText('O');
                    B[0][0] = 'O';
                    flag = false;
                }
            }
            else {

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (flag && B[i][j] == ' ') {
                            if (i == 0 && j == 0) {
                                but1.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 0 && j == 1) {
                                but2.setText("O");
                                B[i][j] = 'O';
                                flag = false;

                            } else if (i == 0 && j == 2) {
                                but3.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 1 && j == 1) {
                                but5.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 1 && j == 2) {
                                but6.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 2 && j == 0) {
                                but7.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 2 && j == 1) {
                                but8.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 2 && j == 2) {
                                but9.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            }
                        }
                    }
                }
            }
            Result();
        }
    }

    private class OnTouch5 implements OnClickListener {

        public void onClick(View view) {
            but5.setText("X");
            B[1][1] = 'X';
            flag = true;


            if (B[1][1] == 'X' && B[0][0] == 'X') {
                if (B[2][2] == ' ') {
                    but9.setText('O');
                    B[2][2] = 'O';
                    flag = false;
                }
            } else if (B[1][1] == 'X' && B[2][2] == 'X') {
                if (B[0][0] == ' ') {
                    but1.setText('O');
                    B[0][0] = 'O';
                    flag = false;
                }
            } else if (B[1][1] == 'X' && B[1][2] == 'X') {
                if (B[1][0] == ' ') {
                    but4.setText('O');
                    B[1][0] = 'O';
                    flag = false;
                }
            } else if (B[1][1] == 'X' && B[1][0] == 'X') {
                if (B[1][2] == ' ') {
                    but6.setText('O');
                    B[1][2] = 'O';
                    flag = false;
                }
            }else if (B[1][1] == 'X' && B[0][1] == 'X') {
                if (B[2][1] == ' ') {
                    but8.setText('O');
                    B[2][1] = 'O';
                    flag = false;
                }
            }else if (B[1][1] == 'X' && B[2][1] == 'X') {
                if (B[0][1] == ' ') {
                    but2.setText('O');
                    B[0][1] = 'O';
                    flag = false;
                }
            }else if (B[1][1] == 'X' && B[0][2] == 'X') {
                if (B[2][0] == ' ') {
                    but7.setText('O');
                    B[2][0] = 'O';
                    flag = false;
                }
            }else if (B[1][1] == 'X' && B[2][0] == 'X') {
                if (B[0][2] == ' ') {
                    but3.setText('O');
                    B[0][2] = 'O';
                    flag = false;
                }
            }

            else {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (flag && B[i][j] == ' ') {
                            if (i == 0 && j == 0) {
                                but1.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 0 && j == 1) {
                                but2.setText("O");
                                B[i][j] = 'O';
                                flag = false;

                            } else if (i == 0 && j == 2) {
                                but3.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 1 && j == 0) {
                                but4.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 1 && j == 2) {
                                but6.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 2 && j == 0) {
                                but7.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 2 && j == 1) {
                                but8.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 2 && j == 2) {
                                but9.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            }
                        }
                    }
                }
            }
            Result();
        }
    }

    private class OnTouch6 implements OnClickListener {

        public void onClick(View view) {

            but6.setText("X");
            B[1][2] = 'X';
            flag = true;


            if (B[1][2] == 'X' && B[0][2] == 'X') {
                if (B[2][2] == ' ') {
                    but9.setText('O');
                    B[2][2] = 'O';
                    flag = false;
                }
            } else if (B[1][2] == 'X' && B[1][0] == 'X') {
                if (B[1][1] == ' ') {
                    but5.setText('O');
                    B[1][1] = 'O';
                    flag = false;
                }
            } else if (B[1][2] == 'X' && B[2][2] == 'X') {
                if (B[0][2] == ' ') {
                    but3.setText('O');
                    B[0][2] = 'O';
                    flag = false;
                }
            } else if (B[1][2] == 'X' && B[1][1] == 'X') {
                if (B[1][0] == ' ') {
                    but4.setText('O');
                    B[1][0] = 'O';
                    flag = false;
                }
            }

            else {

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (flag && B[i][j] == ' ') {
                            if (i == 0 && j == 0) {
                                but1.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 0 && j == 1) {
                                but2.setText("O");
                                B[i][j] = 'O';
                                flag = false;

                            } else if (i == 0 && j == 2) {
                                but3.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 1 && j == 0) {
                                but4.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 1 && j == 1) {
                                but5.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 2 && j == 0) {
                                but7.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 2 && j == 1) {
                                but8.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 2 && j == 2) {
                                but9.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            }
                        }
                    }
                }
            }
            Result();
        }
    }

    private class OnTouch7 implements OnClickListener {

        public void onClick(View view) {

            but7.setText("X");
            B[2][0] = 'X';
            flag = true;


            if (B[2][0] == 'X' && B[1][0] == 'X') {
                if (B[0][0] == ' ') {
                    but1.setText('O');
                    B[0][0] = 'O';
                    flag = false;
                }
            } else if (B[0][0] == 'X' && B[2][0] == 'X') {
                if (B[1][0] == ' ') {
                    but4.setText('O');
                    B[1][0] = 'O';
                    flag = false;
                }
            } else if (B[2][0] == 'X' && B[0][2] == 'X') {
                if (B[1][1] == ' ') {
                    but5.setText('O');
                    B[1][1] = 'O';
                    flag = false;
                }
            } else if (B[2][0] == 'X' && B[2][2] == 'X') {
                if (B[2][1] == ' ') {
                    but8.setText('O');
                    B[2][1] = 'O';
                    flag = false;
                }

            } else if (B[2][0] == 'X' && B[2][1] == 'X') {
                if (B[2][2] == ' ') {
                    but9.setText('O');
                    B[2][2] = 'O';
                    flag = false;
                }
            } else if (B[2][0] == 'X' && B[1][1] == 'X') {
                if (B[0][2] == ' ') {
                    but3.setText('O');
                    B[0][2] = 'O';
                    flag = false;
                }
            }

            else {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (flag && B[i][j] == ' ') {
                            if (i == 0 && j == 0) {
                                but1.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 0 && j == 2) {
                                but3.setText("O");
                                B[i][j] = 'O';
                                flag = false;

                            } else if (i == 1 && j == 0) {
                                but4.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 1 && j == 1) {
                                but5.setText("O");
                                flag = false;
                            } else if (i == 1 && j == 2) {
                                but6.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 0 && j == 1) {
                                but2.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 2 && j == 1) {
                                but8.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 2 && j == 2) {
                                but9.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            }
                        }
                    }
                }
            }
            Result();
        }
    }

    private class OnTouch8 implements OnClickListener {

        public void onClick(View view) {

            but8.setText("X");
            B[2][1] = 'X';
            flag = true;


            if (B[2][1] == 'X' && B[2][2] == 'X') {
                if (B[2][0] == ' ') {
                    but7.setText('O');
                    B[2][0] = 'O';
                    flag = false;
                }
            } else if (B[2][1] == 'X' && B[1][1] == 'X') {
                if (B[0][1] == ' ') {
                    but2.setText('O');
                    B[0][1] = 'O';
                    flag = false;
                }
            } else if (B[2][1] == 'X' && B[2][0] == 'X') {
                if (B[2][2] == ' ') {
                    but9.setText('O');
                    B[2][2] = 'O';
                    flag = false;
                }
            } else if (B[2][1] == 'X' && B[0][1] == 'X') {
                if (B[1][1] == ' ') {
                    but5.setText('O');
                    B[1][1] = 'O';
                    flag = false;
                }
            }

            else {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (flag && B[i][j] == ' ') {
                            if (i == 0 && j == 0) {
                                but1.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 0 && j == 2) {
                                but3.setText("O");
                                B[i][j] = 'O';
                                flag = false;

                            } else if (i == 1 && j == 0) {
                                but4.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 1 && j == 1) {
                                but5.setText("O");
                                flag = false;
                            } else if (i == 1 && j == 2) {
                                but6.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 2 && j == 0) {
                                but7.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 0 && j == 1) {
                                but2.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 2 && j == 2) {
                                but9.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            }
                        }
                    }
                }
            }
            Result();
        }
    }

    private class OnTouch9 implements OnClickListener {

        public void onClick(View view) {

            but9.setText("X");
            B[2][2] = 'X';
            flag = true;


            if (B[2][1] == 'X' && B[2][2] == 'X') {
                if (B[2][0] == ' ') {
                    but7.setText('O');
                    B[2][0] = 'O';
                    flag = false;
                }
            } else if (B[2][2] == 'X' && B[1][2] == 'X') {
                if (B[0][2] == ' ') {
                    but3.setText('O');
                    B[0][2] = 'O';
                    flag = false;
                }
            } else if (B[2][2] == 'X' && B[0][2] == 'X') {
                if (B[1][2] == ' ') {
                    but6.setText('O');
                    B[1][2] = 'O';
                    flag = false;
                }
            } else if (B[2][2] == 'X' && B[2][0] == 'X') {
                if (B[2][1] == ' ') {
                    but8.setText('O');
                    B[2][1] = 'O';
                    flag = false;
                }
            } else if (B[2][2]=='X'&&B[0][0]=='X'){
                if (B[1][1]== ' '){
                    but5.setText('O');
                    B[1][1] = 'O';
                    flag = false;
                }
            }

            else {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (flag && B[i][j] == ' ') {
                            if (i == 0 && j == 0) {
                                but1.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 0 && j == 2) {
                                but3.setText("O");
                                B[i][j] = 'O';
                                flag = false;

                            } else if (i == 1 && j == 0) {
                                but4.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 1 && j == 1) {
                                but5.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 1 && j == 2) {
                                but6.setText("O");
                                flag = false;
                            } else if (i == 2 && j == 0) {
                                but7.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 2 && j == 1) {
                                but8.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            } else if (i == 0 && j == 1) {
                                but2.setText("O");
                                B[i][j] = 'O';
                                flag = false;
                            }
                        }
                    }
                }
            }
            Result();
        }
    }

}
