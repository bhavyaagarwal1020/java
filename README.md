import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;


class Mygame extends JFrame
{
  JLabel computer_ch, ans; //label for computer choice ans answer
  
  JLabel score,ComputerScore,YourScore;
  int cmp_score=0,yr_score=0;
  ImageIcon rock_img, paper_img, scissor_img;
  public void setUp()
  {
   rock_img= new ImageIcon(new ImageIcon("rock_imagee.png").getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
   paper_img= new ImageIcon(new ImageIcon("paper_imagee.png").getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
   scissor_img= new ImageIcon(new ImageIcon("scissors_imagee.png").getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
  
   score=new JLabel("SCORE");
   score.setBounds(1040,0,100,100);
  
   ComputerScore=new JLabel();
   ComputerScore.setText("COMPUTER SCORE : 0");
   ComputerScore.setBounds(1040,15,100,100);
   
   YourScore=new JLabel();
   YourScore.setText("YOUR SCORE : 0");
   YourScore.setBounds(1040,30,100,100);
   

   
   computer_ch=new JLabel();
   computer_ch.setHorizontalTextPosition(JLabel.CENTER);
   computer_ch.setVerticalTextPosition(JLabel.BOTTOM);
   computer_ch.setBounds(580,100,100,100);
   
   ans=new JLabel();
   ans.setBounds(580,400,100,100);

   //setting icon and label
   JLabel jl_rock=new JLabel();
   jl_rock.setText("Rock");
   jl_rock.setIcon(rock_img);
   jl_rock.setHorizontalTextPosition(JLabel.CENTER);
   jl_rock.setVerticalTextPosition(JLabel.BOTTOM);
   jl_rock.setBounds(450,300,100,100);
   
   JLabel jl_paper=new JLabel();
   jl_paper.setText("Paper");
   jl_paper.setIcon(paper_img);
   jl_paper.setHorizontalTextPosition(JLabel.CENTER);
   jl_paper.setVerticalTextPosition(JLabel.BOTTOM);
   jl_paper.setBounds(580,300,100,100);
   
   JLabel jl_scissor=new JLabel();
   jl_scissor.setText("Scissor");
   jl_scissor.setIcon(scissor_img);
   jl_scissor.setHorizontalTextPosition(JLabel.CENTER);
   jl_scissor.setVerticalTextPosition(JLabel.BOTTOM);
   jl_scissor.setBounds(710,300,100,100);

   //adding MouseListener to all events.
   jl_rock.addMouseListener(new MouseAdapter()
   {
     public void mouseClicked(MouseEvent e)
     {
       result(jl_rock.getText());
     }
   });
   
   jl_paper.addMouseListener(new MouseAdapter()
   {
     public void mouseClicked(MouseEvent e)
     {
       result(jl_paper.getText());
     }
   });
   
   jl_scissor.addMouseListener(new MouseAdapter()
   {
     public void mouseClicked(MouseEvent e)
     {
       result(jl_scissor.getText());
     }
   });


   add(jl_rock);
   add(jl_paper);
   add(jl_scissor);
   add(computer_ch);
   add(ans);
   add(score);
   add(ComputerScore);
   add(YourScore);
   setLayout(null);
  }

  
  public void result(String player)
  {
   String[] list={"Rock","Paper","Scissor"};
   int random_choice = (int)((Math.random()*20)%3);
   String computer=list[random_choice];

   computer_ch.setText(computer);

   if(random_choice==0)
   {
    computer_ch.setIcon(rock_img);
   }
   else if(random_choice==1)
   {
    computer_ch.setIcon(paper_img);
   }
   else
   {
    computer_ch.setIcon(scissor_img);
   }

 String res="";
 if(player.equals(computer))
 {
  res="DRAW";
 }

 else if(player.equals("Rock"))
 {
  if(computer.equals("Scissors"))
   {
    res=" YOU WIN !!!";
    yr_score++;
   }
  else
   {
    res=" YOU LOSE !!!";
    cmp_score++;
   }
 }

 else if(player.equals("Paper"))
 {
  
  if(computer.equals("Rock"))
   {
    res=" YOU WIN !!!";
    yr_score++;
   }
  else
   {
    res=" YOU LOSE !!!";
    cmp_score++;
   }
 }

else
{
    if(computer.equals("Paper"))
   {
    res=" YOU WIN !!!";
    yr_score++;
   }
  else
   {
    res=" YOU LOSE !!!";
    cmp_score++;
   }
 }
 ans.setText(res);
 YourScore.setText("YOU : "+yr_score);
 ComputerScore.setText("COMPUTER : "+cmp_score);

}

  public static void main(String ags[])
  {
    Mygame obj=new Mygame();
    obj.setTitle("ROCK PAPER SCISSOR");
    obj.setSize(1600,3000);
    obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    obj.getContentPane().setBackground(Color.PINK);
    obj.setUp();
    obj.setVisible(true);
  }
}

//save by game.java
//to run in cmd
//javac game.java
//java Mygame

//OUTPUT
![Screenshot (144)](https://user-images.githubusercontent.com/102410514/193471700-99015994-2b57-476a-aa4d-670f0aa06f6f.png)

