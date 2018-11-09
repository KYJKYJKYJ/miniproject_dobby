package miniproject;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Dobby_Consumer_Main extends JFrame implements ActionListener {
	Dobby_Consumer_Menu dMenu;
	
	public Dobby_Consumer_Main() {
		dMenu = new Dobby_Consumer_Menu();
		
		this.setTitle("Dobby"); // 프레임 타이틀
		
		//프레임에 붙임
		this.add(BorderLayout.CENTER, dMenu);
		this.setSize(900, 600);
		this.setVisible(true);
		setResizable(false); //크기 조절 불가
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//버튼 이벤트 리스너 연결
	    dMenu.chickenB.addActionListener(this);
	    dMenu.soyChickenB.addActionListener(this);
	    dMenu.yangChickenB.addActionListener(this);
	    dMenu.creamChickenB.addActionListener(this);
	    dMenu.tokbokiChickenB.addActionListener(this);
	    dMenu.marahChickenB.addActionListener(this);
	    dMenu.shrimpChickenB.addActionListener(this);
	    dMenu.garlicChickenB.addActionListener(this);
	    dMenu.tokbokiChickenB.addActionListener(this);
	    dMenu.greenOChickenB.addActionListener(this);
	    dMenu.honeyChickenB.addActionListener(this);
	    dMenu.snowChickenB.addActionListener(this);
	    dMenu.plusB.addActionListener(this); 
	    dMenu.minusB.addActionListener(this);
	    dMenu.registerB.addActionListener(this);
	    dMenu.removeB.addActionListener(this);
	    dMenu.decideB.addActionListener(this);
	} // end Dobby_Main()
	
	public static void main(String[] args) {
		new Dobby_Consumer_Main();

	} // end main()
	
	@Override
	   public void actionPerformed(ActionEvent e) {
	      Object obj = e.getSource();
	      if(obj == dMenu.chickenB) {
	    	  meal_Actions("후라이드치킨", 10000, dMenu.mealNameTF, dMenu.mealPriceTF, dMenu.mealAmountTF);
	      } else if(obj == dMenu.soyChickenB) {
	    	  meal_Actions("간장치킨", 12000, dMenu.mealNameTF, dMenu.mealPriceTF, dMenu.mealAmountTF);
	      } else if(obj == dMenu.yangChickenB) {
	    	  meal_Actions("양념치킨", 11000, dMenu.mealNameTF, dMenu.mealPriceTF, dMenu.mealAmountTF);
	      } else if(obj == dMenu.snowChickenB) {
	    	  meal_Actions("스노윙치킨", 13000, dMenu.mealNameTF, dMenu.mealPriceTF, dMenu.mealAmountTF);
	      } else if(obj == dMenu.hotbChickenB) {
	    	  meal_Actions("핫블링치킨", 13500, dMenu.mealNameTF, dMenu.mealPriceTF, dMenu.mealAmountTF);
	      } else if(obj == dMenu.greenOChickenB) {
		      meal_Actions("파닭", 12000, dMenu.mealNameTF, dMenu.mealPriceTF, dMenu.mealAmountTF);
	      } else if(obj == dMenu.creamChickenB) {
		      meal_Actions("크리미언치킨", 14000, dMenu.mealNameTF, dMenu.mealPriceTF, dMenu.mealAmountTF);
	      } else if(obj == dMenu.honeyChickenB) {
		      meal_Actions("허니멜로치킨", 14000, dMenu.mealNameTF, dMenu.mealPriceTF, dMenu.mealAmountTF);
	      } else if(obj == dMenu.tokbokiChickenB) {
		      meal_Actions("쌀떡볶이치킨", 14000, dMenu.mealNameTF, dMenu.mealPriceTF, dMenu.mealAmountTF);
	      } else if(obj == dMenu.marahChickenB) {
		      meal_Actions("마라핫치킨", 14500, dMenu.mealNameTF, dMenu.mealPriceTF, dMenu.mealAmountTF);
	      } else if(obj == dMenu.garlicChickenB) {
		      meal_Actions("갈릭치킨", 15000, dMenu.mealNameTF, dMenu.mealPriceTF, dMenu.mealAmountTF);
	      } else if(obj == dMenu.shrimpChickenB) {
		      meal_Actions("새우치킨", 16000, dMenu.mealNameTF, dMenu.mealPriceTF, dMenu.mealAmountTF);
	      } // 메뉴 선택 액션
	      
	      else if(obj == dMenu.plusB) {
	    	  pAction();
	      } else if(obj == dMenu.minusB) {
	    	  mAction();
	      } // 수량 증감 액션
	      
	      else if(obj == dMenu.registerB) {
	    	  regAction();
	      } else if(obj == dMenu.removeB) {
	    	  delAction();
	      } else if(obj == dMenu.decideB) {
	    	  decAction();
	      }
	   }//end actionPerformed()
	
	private void meal_Actions(String name, int price, 
			JTextField nameTF, JTextField priceTF, JTextField amountTF) {
		int amount = 1; // 메뉴를 누를 경우 기본 수량을 1로 하여 메뉴 선택
		nameTF.setText(name);
		priceTF.setText(Integer.toString(price));
		amountTF.setText(Integer.toString(amount));
	}  // end meal_Actions();
	
	private void pAction() {
		if(dMenu.mealNameTF.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "메뉴를 먼저 선택해주세요!", "메뉴 선택", JOptionPane.ERROR_MESSAGE);
			return; // 메뉴 이름이 담긴 텍스트필드를 읽어서 공백일 경우 메뉴가 선택되지 않은 것이므로 메세지 출력 
		} else {
			int count = Integer.parseInt(dMenu.mealAmountTF.getText());
			count++;
			dMenu.mealAmountTF.setText(Integer.toString(count));
		}
	} // end pAction()
	
    private void mAction() {
		if(dMenu.mealNameTF.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "메뉴를 먼저 선택해주세요!", "메뉴 선택", JOptionPane.ERROR_MESSAGE);
			return; // 메뉴 이름이 담긴 텍스트필드를 읽어서 공백일 경우 메뉴가 선택되지 않은 것이므로 메세지 출력 
		} else {
			int count = Integer.parseInt(dMenu.mealAmountTF.getText());
			if(count <= 1) {
				JOptionPane.showMessageDialog(this, "0 마리 이하는 주문 하실 수 없습니다!", "수량 오류", JOptionPane.ERROR_MESSAGE);
				return;
			} // 음수로 주문 할 수 없도록 경고 메세지 출력
			count--;
			dMenu.mealAmountTF.setText(Integer.toString(count));
		}
    } // end mAction()
  
   private void regAction() { // 등록버튼 액션
	   if (dMenu.mealNameTF.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "음식을 선택해 주세요!", "주문 오류!", JOptionPane.ERROR_MESSAGE);
			return;
		} else {
			String[] row = new String[3];
			row[0] = dMenu.mealNameTF.getText().trim();
			row[1] = dMenu.mealAmountTF.getText().trim();
			row[2] = dMenu.mealPriceTF.getText().trim();
			dMenu.tableModel.addRow(row); // 음식 정보를 받아서 테이블에 삽입
			
			int fPrice = 0;
			for(int i = 0; i < dMenu.table.getRowCount(); i++) {
				fPrice += (Integer.parseInt((String) dMenu.tableModel.getValueAt(i, 2)) * Integer.parseInt((String) dMenu.tableModel.getValueAt(i, 1)));
				// 테이블로 부터 금액 컬럼 값을 읽어나간 후 변수에 덧셈하여 저장
				dMenu.fullPriceTF.setText(Integer.toString(fPrice));
			}
		}
		
		// 음식 정보 테이블 삽입 후 텍스트 필드 초기화
		dMenu.mealNameTF.setText("");
		dMenu.mealAmountTF.setText("");
		dMenu.mealPriceTF.setText("");

	} // end regAction()

	private void delAction() { // 삭제버튼 액션
		int row = dMenu.table.getSelectedRow();
		if (row == -1) {
			JOptionPane.showMessageDialog(this, "주문 제거할 메뉴를 선택해주세요!", "주문 오류!", JOptionPane.ERROR_MESSAGE);
			return;
		} // 삭제할 게 없으면 출력
		dMenu.tableModel.removeRow(row);// 행삭제
		
		int fPrice = 0;
		if(dMenu.table.getRowCount() == 0)
			dMenu.fullPriceTF.setText(Integer.toString(0)); // 행이 없을 경우 주문하려는 메뉴가 없는 것 이므로 총 가격 0으로 설정
		else {
			for(int i = 0; i < dMenu.table.getRowCount(); i++) {
				fPrice += (Integer.parseInt((String) dMenu.tableModel.getValueAt(i, 2)) * Integer.parseInt((String) dMenu.tableModel.getValueAt(i, 1)));
				// 테이블로 부터 금액 컬럼 값을 읽어나간 후 변수에 덧셈하여 저장
				dMenu.fullPriceTF.setText(Integer.toString(fPrice));
			}
		}		
	} // end delAction()

	private void decAction() { // 결정버튼 액션
		if (dMenu.fullPriceTF.getText().equals(Integer.toString(0))) {
			// 메뉴를 등록하지 않았으면 총 가격이 0이므로 메뉴를 등록한 후에 결정버튼을 누를 수 있도록 메세지 출력
			JOptionPane.showMessageDialog(this, "음식을 먼저 등록해주세요!", "주문 오류!", JOptionPane.ERROR_MESSAGE);
			return;
		} /*else if(Integer.parseInt(dMenu.fullPriceTF.getText()) < 10000) {
			//10000원 이상부터 주문 결정 가능
			JOptionPane.showMessageDialog(this, "10000원 이상 부터 주문 가능 합니다!", "주문 오류!", JOptionPane.ERROR_MESSAGE);
			return;
		}*/
				
		int chk = JOptionPane.showConfirmDialog(this, "주문 결정하시겠습니까?", "주문 결정", JOptionPane.YES_NO_OPTION);

		if (chk == JOptionPane.NO_OPTION) {
			return;
		} else if (chk == JOptionPane.YES_OPTION) {
			dMenu.tableModel.setRowCount(0); // table 초기화
			dMenu.fullPriceTF.setText(Integer.toString(0)); // 총 금액 초기화
		}
	} // end decAction()
}