package org.sp.app0628.layout;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//메모장을 만들어보기
public class Editor extends JFrame{
	JMenuBar bar; //메뉴바
	//메뉴
	JMenu m_file; 
	JMenu m_edit;
	JMenu m_style;
	JMenu m_view;
	JMenu m_help;
	
	//8개의 메뉴 아이템
	JMenuItem i_new;
	JMenuItem i_window;
	JMenuItem i_open;
	JMenuItem i_save;
	JMenuItem i_saveas;
	JMenuItem i_page;
	JMenuItem i_print;
	JMenuItem i_exit;
	
	JTextArea area;
	JScrollPane scroll;
	
	public Editor() {
		bar = new JMenuBar(); //메뉴바 생성
		
		m_file=new JMenu("파일(F)");
		m_edit=new JMenu("편집(E)");
		m_style=new JMenu("서식(O)");
		m_view=new JMenu("보기(V)");
		m_help=new JMenu("도움말(H)");
		
		//[파일] 메뉴에 하위 아이템들 부착
		i_new = new JMenuItem("새로 만들기");
		i_window = new JMenuItem("새창");
		i_open = new JMenuItem("열기");
		i_save = new JMenuItem("저장");
		i_saveas = new JMenuItem("다른 이름으로 저장");
		i_page = new JMenuItem("페이지 설정");
		i_print = new JMenuItem("인쇄");
		i_exit = new JMenuItem("끝");
		
		//area 생성
		area =  new JTextArea();
		//스크롤 생성
		scroll = new JScrollPane(area); //component형 인스턴스가 매개변수로 와야함
													//그리고 최종적으로 scroll을 add해야함
		
		m_file.add(i_new);
		m_file.add(i_window);
		m_file.add(i_open);
		m_file.add(i_save);
		m_file.add(i_saveas);
		//-------------------------
		m_file.addSeparator(); //구분선긋기
		m_file.add(i_page);
		m_file.add(i_print);
		//-------------------------
		m_file.addSeparator(); //구분선긋기
		m_file.add(i_exit);
		
		//바에 메뉴들 부착
		bar.add(m_file);
		bar.add(m_edit);
		bar.add(m_style);
		bar.add(m_view);
		bar.add(m_help);
		
		//바를 프레임에 부착함
		this.setJMenuBar(bar); //this 생략가능
		
		//센터에 area 부착
		this.add(scroll, BorderLayout.CENTER); //center는 디폴트이기 때문에 명시할 필요는 없음
		
		this.setSize(800, 700); //this 생략가능
		this.setVisible(true); //this 생략가능
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
	}

	public static void main(String[] args) {
		new Editor();
	}
}
