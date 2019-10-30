package com.example.mytenniscounterv01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView player1score0;
    Button player1point15;
    Button player1point30;
    Button player1point40;
    Button player1win;
    TextView player1game0;
    TextView player1set0;
    Button reset;
    TextView player2score0;
    Button player2point15;
    Button player2point30;
    Button player2point40;
    Button player2win;
    TextView player2game0;
    TextView player2set0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player1score0=findViewById(R.id.player1score0);
        player1point15=findViewById(R.id.player1point15);
        player1point30=findViewById(R.id.player1point30);
        player1point40=findViewById(R.id.player1point40);
        player1win=findViewById(R.id.player1win);
        player1game0=findViewById(R.id.player1game0);
        player1set0=findViewById(R.id.player1set0);
        reset=findViewById(R.id.reset);
        player2score0=findViewById(R.id.player2score0);
        player2point15=findViewById(R.id.player2point15);
        player2point30=findViewById(R.id.player2point30);
        player2point40=findViewById(R.id.player2point40);
        player2win=findViewById(R.id.player2win);
        player2game0=findViewById(R.id.player2game0);
        player2set0=findViewById(R.id.player2set0);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentPString=player1score0.getText().toString();
                int currentPInt=Integer.parseInt(currentPString);
                currentPInt=0;
                player1score0.setText(String.valueOf(currentPInt));
                player1game0.setText(String.valueOf(currentPInt));
                player1set0.setText(String.valueOf(currentPInt));
                player2score0.setText(String.valueOf(currentPInt));
                player2game0.setText(String.valueOf(currentPInt));
                player2set0.setText(String.valueOf(currentPInt));
            }

        });
        player1point15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentPString=player1score0.getText().toString();
                int currentPInt=Integer.parseInt(currentPString);
                currentPInt=15;
                player1score0.setText(String.valueOf(currentPInt));
            }

        });
        player1point30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentPString=player1score0.getText().toString();
                int currentPInt=Integer.parseInt(currentPString);
                currentPInt=30;
                player1score0.setText(String.valueOf(currentPInt));
            }

        });
        player1point40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentPString=player1score0.getText().toString();
                int currentPInt=Integer.parseInt(currentPString);
                currentPInt=40;
                player1score0.setText(String.valueOf(currentPInt));
            }

        });
        player1win.setOnClickListener(new View.OnClickListener() {//win if current score is == 6 ,set score to 0, and game ++
            @Override
            public void onClick(View view) {
                String currentPString=player1score0.getText().toString();
                int currentPInt=Integer.parseInt(currentPString);
                if(currentPInt==40) {
                    currentPInt = 0;
                    player1score0.setText(String.valueOf(currentPInt));
                            String currentPGString = player1game0.getText().toString();
                            int currentPIntG = Integer.parseInt(currentPGString);//current point int for game
                            if(currentPIntG==6)
                            {
                                String currentPSString=player1set0.getText().toString();//current point set string
                                int currentPIntSS = Integer.parseInt(currentPSString);//current point int for set
                                currentPIntSS++;//cuurent point int string set
                                player1set0.setText(String.valueOf(currentPIntSS));
                                currentPIntG=0;
                                player1game0.setText(String.valueOf(currentPIntG));
                                player2score0.setText(String.valueOf(0));
                            }
                            else {
                                currentPIntG++;
                                player1game0.setText(String.valueOf(currentPIntG));
                                player2score0.setText(String.valueOf(0));
                            }
                }
            }

        });
        player2point15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentPString=player2score0.getText().toString();
                int currentPInt=Integer.parseInt(currentPString);
                currentPInt=15;
                player2score0.setText(String.valueOf(currentPInt));
            }

        });
        player2point30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentPString=player2score0.getText().toString();
                int currentPInt=Integer.parseInt(currentPString);
                currentPInt=30;
                player2score0.setText(String.valueOf(currentPInt));
            }

        });
        player2point40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentPString=player2score0.getText().toString();
                int currentPInt=Integer.parseInt(currentPString);
                currentPInt=40;
                player2score0.setText(String.valueOf(currentPInt));
            }

        });
        player2win.setOnClickListener(new View.OnClickListener() {//win if current score is == 6 ,set score to 0, and game ++
            @Override
            public void onClick(View view) {
                String currentPString=player2score0.getText().toString();
                int currentPInt=Integer.parseInt(currentPString);
                if(currentPInt==40) {
                    currentPInt = 0;
                    player2score0.setText(String.valueOf(currentPInt));
                    String currentPGString = player2game0.getText().toString();
                    int currentPIntG = Integer.parseInt(currentPGString);//current point int for game
                    if(currentPIntG==6)
                    {
                        String currentPSString=player2set0.getText().toString();//current point set string
                        int currentPIntSS = Integer.parseInt(currentPSString);//current point int for set
                        currentPIntSS++;//cuurent point int string set
                        player2set0.setText(String.valueOf(currentPIntSS));
                        currentPIntG=0;
                        player2game0.setText(String.valueOf(currentPIntG));
                        player1score0.setText(String.valueOf(0));
                    }
                    else {
                        currentPIntG++;
                        player2game0.setText(String.valueOf(currentPIntG));
                        player1score0.setText(String.valueOf(0));
                    }
                }
            }

        });
    }
}
