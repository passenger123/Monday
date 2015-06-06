package com.example.monday;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class thegame extends Activity {
	private ImageView myImageView;
	private ImageView myImageView01;
	private ImageView myImageView02;
	private ImageView myImageView03;
	private ImageView myImageView04;
	private ImageView myImageView05;
	private ImageView myImageView06;
	private ImageView myImageView07;
	private ImageView myImageView08;
	private Button mybutton;
	private int a=1;
	private int[] myImage={
			R.drawable.p11,
			R.drawable.p02,
			R.drawable.p03, 
			R.drawable.p05,
			R.drawable.p06,
			R.drawable.p07, 
			R.drawable.p08,
			R.drawable.p09,
			R.drawable.p10, 
	};
	private View.OnClickListener MyimageClistener;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.thegame);
		 myImageView=(ImageView)findViewById(R.id.mImage01);
	     myImageView01=(ImageView)findViewById(R.id.mImage02);
	     myImageView02=(ImageView)findViewById(R.id.mImage03);
	     myImageView03=(ImageView)findViewById(R.id.mImage04);
	     myImageView04=(ImageView)findViewById(R.id.mImage05);
	     myImageView05=(ImageView)findViewById(R.id.mImage06);
	     myImageView06=(ImageView)findViewById(R.id.mImage07);
	     myImageView07=(ImageView)findViewById(R.id.mImage08);
	     myImageView08=(ImageView)findViewById(R.id.mImage09);
	     mybutton=(Button)findViewById(R.id.mButton);
	     Randon();
	    /* MyimageClistener=*/
	     MyimageClistener= new View.OnClickListener() {
				
	    	 @Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					if(a==0)
					{
						switch(v.getId()){
					
					case R.id.mImage01:
						SetImage(0,myImageView);
						 
						break;
					case R.id.mImage02:
						SetImage(1,myImageView01);
						 
						break;
					case R.id.mImage03:
						SetImage(2,myImageView02);
						
					case R.id.mImage04:
						SetImage(3,myImageView03);
						 
						break;
					case R.id.mImage05:
						SetImage(4,myImageView04);
						 
						break;
					case R.id.mImage06:
						SetImage(5,myImageView05);
						
					case R.id.mImage07:
						SetImage(6,myImageView06);
						 
						break;
					case R.id.mImage08:
						SetImage(7,myImageView07);
						 
						break;
					case R.id.mImage09:
						SetImage(8,myImageView08);
						
						default:
						break;	 						
					}
					
				}
			}
		     
		};
	     
	     
	     myImageView.setOnClickListener(MyimageClistener);
	     myImageView01.setOnClickListener(MyimageClistener);
	     myImageView02.setOnClickListener(MyimageClistener);
	     myImageView03.setOnClickListener(MyimageClistener);
	     myImageView04.setOnClickListener(MyimageClistener);
	     myImageView05.setOnClickListener(MyimageClistener);
	     myImageView06.setOnClickListener(MyimageClistener);
	     myImageView07.setOnClickListener(MyimageClistener);
	     myImageView08.setOnClickListener(MyimageClistener);
	     
	     
	     mybutton.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					if(a==1)
					{
						myImageView.setImageResource(R.drawable.p04);
						myImageView01.setImageResource(R.drawable.p04);
						myImageView02.setImageResource(R.drawable.p04);
						myImageView03.setImageResource(R.drawable.p04);
						myImageView04.setImageResource(R.drawable.p04);
						myImageView05.setImageResource(R.drawable.p04);
						myImageView06.setImageResource(R.drawable.p04);
						myImageView07.setImageResource(R.drawable.p04);
						myImageView08.setImageResource(R.drawable.p04);
						myImageView.setAlpha(255);
						myImageView01.setAlpha(255);
						myImageView02.setAlpha(255);
						myImageView03.setAlpha(255);
						myImageView04.setAlpha(255);
						myImageView05.setAlpha(255);
						myImageView06.setAlpha(255);
						myImageView07.setAlpha(255);
						myImageView08.setAlpha(255);
						Randon();
						a--;
					}
				}
			});
	     
	}
	
	
	
	 @SuppressWarnings("deprecation")
	private void SetImage(int temp,ImageView ss)
	    {
	    	myImageView.setImageResource(myImage[0]);
			myImageView02.setImageResource(myImage[1]);
			myImageView03.setImageResource(myImage[2]);
			myImageView04.setImageResource(myImage[3]);
			myImageView05.setImageResource(myImage[4]);
			myImageView06.setImageResource(myImage[5]);
			myImageView07.setImageResource(myImage[6]);
			myImageView08.setImageResource(myImage[7]);
			myImageView01.setImageResource(myImage[8]);
			myImageView.setAlpha(100);
			myImageView02.setAlpha(100);
			myImageView03.setAlpha(100);
			myImageView04.setAlpha(100);
			myImageView05.setAlpha(100);
			myImageView06.setAlpha(100);
			myImageView07.setAlpha(100);
			myImageView08.setAlpha(100);
			myImageView01.setAlpha(100);
			ss.setAlpha(255);
			if(myImage[temp]==R.drawable.p11)
			{
				Toast.makeText(thegame.this, "恭喜你猜對了", Toast.LENGTH_SHORT)
				.show();
			}
			else
			{
				Toast.makeText(thegame.this, "對不起你猜錯了", Toast.LENGTH_SHORT)
				.show();
			}
			a++;
	    }
	
	
	
	private void Randon() {
		for(int i=0;i<myImage.length;i++)
		{
			int temp=myImage[i];
    		int s=(int)(Math.random()*2);
    		myImage[i]=myImage[s];
    		myImage[s]=temp;
		}
		// TODO Auto-generated method stub
		
	}
 
}
