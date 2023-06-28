package org.sp.app0628.layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;

public class Test1 {
	
	public static void main(String[] args) {
		Frame f=new Frame(); //윈도우 생성
		f.setSize(500, 400);
		
		f.setLayout(new BorderLayout()); //프레임에 보더 레이아웃 적용
		
		//패널은 현실의 판자를 표현한 것이며, 색상이 없다
		Panel[] p=new Panel[5];
		for(int i=0; i<p.length; i++) {
			p[i]=new Panel(); //배열에 패널을 생성하여 대입함
		}
		
		p[0].setBackground(Color.RED);
		p[1].setBackground(Color.ORANGE);
		p[2].setBackground(Color.YELLOW);
		p[3].setBackground(Color.GREEN);
		p[4].setBackground(Color.BLUE);
		
		//new Dimension(500,100);
		p[0].setPreferredSize(new Dimension(500,100));
		p[1].setPreferredSize(new Dimension(500,100));
		p[2].setPreferredSize(new Dimension(100,200));
		p[3].setPreferredSize(new Dimension(300,200));
		p[4].setPreferredSize(new Dimension(100,200));
		
		//북쪽에 패널 부착
		f.add(p[0], BorderLayout.NORTH); //북쪽에 패널 0번째 부착함
		//남쪽에 패널 부착
		f.add(p[1], BorderLayout.SOUTH); //남쪽에 패널 1번째 부착함
		//서쪽에 패널 부착
		f.add(p[2], BorderLayout.WEST); //서쪽에 패널 2번째 부착함
		//서쪽에 패널 부착
		//f.add(p[3], BorderLayout.CENTER); //가운데에 패널 3번째 부착함
		//서쪽에 패널 부착
		f.add(p[4], BorderLayout.EAST); //동쪽에 패널 4번째 부착함
		
		//버튼 2개 생성해 남쪽 패널에 부착하기
		Button bt1=new Button("Login");
		Button bt2=new Button("Regist");
		
		//자바 GUI의 컴포넌트 중 해당객체가 컨테이너(Container)일 경우, 다른 컴포넌트들을 포함할 능력이 있게됨
		//또한 다른 컴포넌트를 포함할때는 반드시 어떤 방식으로 컴포넌트들을 배치할 지를 결정해야하며
		//이때 사용되는 객체가 바로 배치관리자임(ex.플로우레이아웃, 보더레이아웃...)
		//Frame, Panel이건 즉, 컨테이너 형인 경우 만일 개발자가 배치를 명시하지 않으면 배치가 적용되지 않는 것이 아니고
		//디폴트로 배치가 자바 언어에서 미리 정해놓은 배치관리자가 적용되는데
		//Frame-BorderLayout(디폴트)
		//Panel-FlowLayout(디폴트)
		
		//남쪽 패널에 버튼추가 -> 패널을 이용하면 모든 객체가 본연의 크기를 갖고 부착됨 (html-inline방식과 유사함)
		//p[1].add(bt1);
		//p[1].add(bt2);
		
		//센터 영역에 버튼 추가 
		//-> 위의 남쪽 패널에 추가했던 버튼과 달리 아래 패널 없이 센터 영역에 추가한 버튼은
		//    버튼이 센터영역의 크기 만큼 설정되게 됨 (html-Block)
		f.add(bt1, BorderLayout.CENTER); //센터 영역에 버튼 추가
		
		f.setVisible(true);
	}
}
