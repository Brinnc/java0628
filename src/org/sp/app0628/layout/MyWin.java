/*
 * java.awt패키지는 os마다 디자인이 달라지는 문제 발생함
 * 따라서 디자인을 모든 os종류와 상관없이 자바에서 지정한 디자인 테마로 고정하기 위헤
 * Swing이 개발되었고, 스윙은 javax.swing 패키지에서 지원됨
 * 스윙은 기존의 awt 객체명에 접두어로 J를 붙임
 * 
 * 주의! 그렇다고해서 awt가 완전히 사용되지 않는 것은 아님
 * ex) 기존의 배티관리자 등은 여전히 사용됨
 * 결론: 자바 기반으로 GUI프그램 개발 시 awt+swing 조합해서 개발
 * */

package org.sp.app0628.layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWin extends JFrame{ //"is a" JFrame
	JButton bt; //"has a" JButton
	
	//부품이 존재한다면, 생성자를 초기화할 이유가 있음
	public MyWin() {
		bt=new JButton("난 스윙버튼");
		
		//윈도우의 레이아웃을 플로우레이아웃으로 변경
		this.setLayout(new FlowLayout());
		
		add(bt);//나(프레임)에게 버튼 부착
		
		this.setSize(300, 400); //this 생략가능
		this.setVisible(true); //this 생략가능
		
		//윈도우 창을 닫으면 setVisible(false)가 될 뿐이므로,
		//실제프로그램인 프로세스는 여전히 살아있음, 따라서 프로세스마저 죽이는 방법?
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//위 코드 삽입으로 인해 창을 닫으면 아래 콘솔의 붉은 버튼도 비활성화됨
		
	}
	
	public static void main(String[] args) {
		new MyWin();
		
	}
}
