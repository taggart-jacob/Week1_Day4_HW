Problem: Create a calculator app to perform all the standard calculator operations like addition, subtraction, multiplication, divide etc. 
 -No edittexts
 -Changing the orientation to landscape(layout qualifier) will display now functionality (Scientific calculator)

Solution:


    package com.example.week1_day4_hw;

    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.Switch;
    import android.widget.TextView;

    public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //sets a boolean to check if enter has been clicked
    boolean count = false;
    //String for the operator (probably should have made it a character variable, but low on time...)
    String operator;
    //TextViews for calculate display and result
    TextView viewCalculate;
    TextView viewResult;
    //all buttons
    Button btn0;
    Button btn9;
    Button btn8;
    Button btn7;
    Button btn6;
    Button btn5;
    Button btn4;
    Button btn3;
    Button btn2;
    Button btn1;
    Button btnAdd;
    Button btnDecimal;
    Button btnDiv;
    Button btnClear;
    Button btnMin;
    Button btnMul;
    Button btnEnter;

    //the first number displays this on calculate view before changing it to a string
    StringBuilder firstStr = new StringBuilder();
    //num1 and 2 strings
    String num1;
    String num2;
    //a string array to store the equation
    String[] equation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //upon executing the code
        super.onCreate(savedInstanceState);
        //the UI is taken from the activity_main.xml
        setContentView(R.layout.activity_main);
        //setting all buttons to their respective views
        btn0 = findViewById(R.id.btn0);
        btn9 = findViewById(R.id.btn9);
        btn8 = findViewById(R.id.btn8);
        btn7 = findViewById(R.id.btn7);
        btn6 = findViewById(R.id.btn6);
        btn5 = findViewById(R.id.btn5);
        btn4 = findViewById(R.id.btn4);
        btn3 = findViewById(R.id.btn3);
        btn2 = findViewById(R.id.btn2);
        btn1 = findViewById(R.id.btn1);
        btnAdd = findViewById(R.id.btnAdd);
        btnDecimal = findViewById(R.id.btnDecimal);
        btnDiv = findViewById(R.id.btnDiv);
        btnClear = findViewById(R.id.btnClear);
        btnMin = findViewById(R.id.btnMin);
        btnMul = findViewById(R.id.btnMul);
        viewCalculate = findViewById(R.id.viewCalculate);
        btnEnter = findViewById(R.id.btnEnter);
        viewResult = findViewById(R.id.viewResult);
        //sets all onClickListeners to listen for a click on their respective views
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnMin.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnDecimal.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnEnter.setOnClickListener(this);

    }

    //private function for adding to ensure data persistency
    private String addNumbers(String num1, String num2) {
        //final doubles to make sure each cannot be changed
        final double numOne = Double.parseDouble(num1);
        final double numTwo = Double.parseDouble(num2);
        //returns the value of the parsed Strings which are now doubles added together
        return String.valueOf(numOne + numTwo);
    }

    //private function for subtracting
    private String subNumbers(String num1, String num2) {
        //final doubles that are assigned to parsed strings of numbers user entered
        final double numOne = Double.parseDouble(num1);
        final double numTwo = Double.parseDouble(num2);
        //returns the subtraction
        return String.valueOf(numOne - numTwo);
    }

    //private function for dividing
    private String divNumbers(String num1, String num2) {
        //final doubles assigned to parsed strings of user input nums
        final double numOne = Double.parseDouble(num1);
        final double numTwo = Double.parseDouble(num2);
        //returns the division result
        return String.valueOf(numOne / numTwo);
    }

    //private function for multiplying
    private String mulNumbers(String num1, String num2) {
        //""
        final double numOne = Double.parseDouble(num1);
        final double numTwo = Double.parseDouble(num2);
        //returns product
        return String.valueOf(numOne * numTwo);
    }

    //overrides the onClickListener to handle the clicks how they need to with the clicked view as argument
    @Override
    public void onClick(View v) {
        //switch case to decide which button was pressed
        switch (v.getId()) {
            case R.id.btn0:
                //if 0 is clicked, then 0 is appended to firstStr
                firstStr.append(0);
                //sets view text to firstStr
                viewCalculate.setText(firstStr);
                break;
            //if 1 is pressed...and so on
            case R.id.btn1:
                //same with 1 and so on
                firstStr.append(1);
                viewCalculate.setText(firstStr);
                break;

            case R.id.btn2:
                firstStr.append(2);
                viewCalculate.setText(firstStr);
                break;

            case R.id.btn3:
                firstStr.append(3);
                viewCalculate.setText(firstStr);
                break;

            case R.id.btn4:
                firstStr.append(4);
                viewCalculate.setText(firstStr);
                break;

            case R.id.btn5:
                firstStr.append(5);
                viewCalculate.setText(firstStr);
                break;

            case R.id.btn6:
                firstStr.append(6);
                viewCalculate.setText(firstStr);
                break;

            case R.id.btn7:
                firstStr.append(7);
                viewCalculate.setText(firstStr);
                break;

            case R.id.btn8:
                firstStr.append(8);
                viewCalculate.setText(firstStr);
                break;

            case R.id.btn9:
                firstStr.append(9);
                viewCalculate.setText(firstStr);
                break;
            //if button clear is pressed
            case R.id.btnClear:
                //clears the first number's string
                firstStr.setLength(0);
                //resets the calculate textview to "Calculate"
                viewCalculate.setText("Calculate");
                if (count == true) {
                    firstStr.setLength(0);
                }
                //after clear, resets the text to "result"
                viewResult.setText("Result");
                //resets the boolean for the enter button to be false so that the result does not populate in the next equation after a clear
                count = false;
                break;
            //if decimal
            case R.id.btnDecimal:
                //appends "." firstStr
                firstStr.append(".");
                //sets the text after append
                viewCalculate.setText(firstStr);
                break;
            //if add button
            case R.id.btnAdd:
                //operator string is add
                operator = "add";
                //appends addition to calculate view
                firstStr.append("+");
                //sets text to the calculate view after the append
                viewCalculate.setText(firstStr);
                //if enter has been clicked
                if (count == true) {
                    firstStr.setLength(0);
                    firstStr.append(viewResult.getText() + "+");
                    viewCalculate.setText(firstStr);

                }
                break;
            //if minus button
            case R.id.btnMin:
                // num1 = Double.parseDouble(firstStr.toString());
                operator = "min";
                firstStr.append("-");
                viewCalculate.setText(firstStr);
                if (count == true) {
                    firstStr.setLength(0);
                    firstStr.append(viewResult.getText() + "-");
                    viewCalculate.setText(firstStr);
                }
                break;

            case R.id.btnMul:
                // num1 = Double.parseDouble(firstStr.toString());
                operator = "mul";
                firstStr.append("*");
                viewCalculate.setText(firstStr);

                if (count == true) {
                    firstStr.setLength(0);
                    firstStr.append(viewResult.getText() + "*");
                    viewCalculate.setText(firstStr);
                }
                break;

            case R.id.btnDiv:
                // num1 = Double.parseDouble(firstStr.toString());
                operator = "div";
                firstStr.append("/");
                viewCalculate.setText(firstStr);

                if (count == true) {
                    firstStr.setLength(0);
                    firstStr.append(viewResult.getText() + "/");
                    viewCalculate.setText(firstStr);
                }
                break;

            case R.id.btnEnter:

                count = true;
                if (operator.equals("add")) {
                    //splitting the string into individual strings to be stored in the equation string array to be separate entities
                    equation = firstStr.toString().split("\\+", 2);
                    //sets the two values being operated on to the first and second splitting of the string
                    num1 = equation[0];
                    num2 = equation[1];
                    //result's string is equal to adding those two numbers
                    String result = addNumbers(num1, num2);
                    //sets the result view to the result
                    viewResult.setText(result);
                    //if the user continues operating after enter trying to use the result as first number, then num1 will equal the previous result
                    num1 = result;

                } else if (operator.equals("min")) {
                    equation = firstStr.toString().split("-", 2);
                    num1 = equation[0];
                    num2 = equation[1];
                    String result = subNumbers(num1, num2);
                    viewResult.setText(result);
                    num1 = result;

                } else if (operator.equals("mul")) {
                    equation = firstStr.toString().split("\\*", 2);
                    num1 = equation[0];
                    num2 = equation[1];
                    String result = mulNumbers(num1, num2);
                    viewResult.setText(result);

                } else if (operator.equals("div")) {
                    equation = firstStr.toString().split("/", 2);
                    num1 = equation[0];
                    num2 = equation[1];
                    String result = divNumbers(num1, num2);
                    viewResult.setText(result);
                    num1 = result;
                }
                //after hitting enter and running all necessary function
                firstStr.setLength(0);
                //deletes calculate view's text after all functions carried out after enter is pressed, this deletes calculates view after enter
                viewCalculate.setText("");
                //resets the boolean for enter to false
                count = false;
        }
    }
    }
1)Upon opening
2)Equation based on buttons clicked
3)After Enter is pressed
4)After Clear is pressed
![Screen Shot 2019-06-09 at 12 32 34 PM](https://user-images.githubusercontent.com/51377398/59161605-ff16b200-8ab2-11e9-9aa8-dca7ff0de60d.png)
![Screen Shot 2019-06-09 at 12 32 58 PM](https://user-images.githubusercontent.com/51377398/59161606-ff16b200-8ab2-11e9-8718-9e3f416f611d.png)
![Screen Shot 2019-06-09 at 12 33 18 PM](https://user-images.githubusercontent.com/51377398/59161607-ff16b200-8ab2-11e9-9771-87447fffdbbb.png)
![Screen Shot 2019-06-09 at 12 33 31 PM](https://user-images.githubusercontent.com/51377398/59161608-ff16b200-8ab2-11e9-8743-07797467c0cd.png)
