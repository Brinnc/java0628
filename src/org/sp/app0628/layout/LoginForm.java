package org.sp.app0628.layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

//상속
//1) 부모의 재산을 내 것처럼 접근할 수 있음
//2) 상속관계에 있는 객체들을 서로 같은 종류
public class LoginForm extends Frame { // LoginForm is a Frame
	// Frame f; //윈도우
	Label la_id; // null : has a 관계의 부붚들을 적극적으로 초기화하지 않을 경우 디폴트는 null
	Label la_pass; // null
	TextField t_id; // null
	TextField t_pass;
	Button bt_login;
	Button bt_join;
	Panel p_center; //가운데 영역에서 별도의 레이아웃을 적용하기 위한 패널
		//패널은 디폴트가 FlowLayout임
	Panel p_south; //남쪽 영역에 버튼들을 포함하게 될 패널 선언

	// 프레임과 프레임이 갖고 있는 재료들을 초기화함
	// 로그인폼이 곧 윈도우이고, 이 윈도우가 생성되는 시점에서
	// 윈도우가 보유한 부품들도 함께 메모리에 생성되어야하므로 초기화할 이유가 있음
	public LoginForm() {
		la_id = new Label("ID");
		la_pass = new Label("Password");
		t_id = new TextField();
		t_pass = new TextField();
		bt_login = new Button("Login");
		bt_join = new Button("Join");
		p_center=new Panel();
		p_south=new Panel();
		
		//배경색 지정
		la_id.setBackground(Color.YELLOW);
		
		//패널의 레이아웃 변경
		p_center.setLayout(new GridLayout(2,2));
		
		//센터의 패널에 각종 폼 요소들을 부착
		p_center.add(la_id); //0,0
		p_center.add(t_id); //0,1
		p_center.add(la_pass); //1,0
		p_center.add(t_pass); //1,1
		

		// 생성된 부품들을 윈도우인 프레임에 부착하자
		// 나.add();
		// this.add(la_id); 
		//하지만 내가 곧 윈도우, 즉 프레임이므로 레퍼런스 변수는 나를 가리키는 this를 쓸 수 있으며 this 생략도 가능함
		//add(la_id, BorderLayout.CENTER);
		this.add(p_center, BorderLayout.CENTER); //프레임에 패널부착
		
		//패널에 버튼 부착
		p_south.add(bt_login);
		p_south.add(bt_join);
		
		//프레임의 남쪽 영역에 패널 부착
		this.add(p_south, BorderLayout.SOUTH);
		
		
		this.setSize(300, 120); //나의 크기 설정
		this.setVisible(true); //나를 보이게함
		
	}

	public static void main(String[] args) {
		LoginForm form = new LoginForm();
	}
}
