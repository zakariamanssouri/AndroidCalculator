package ma.enset.calculatorv1_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.sun.script.javascript.RhinoScriptEngine;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {


    TextView ExpressionTextView,result;

    String expressionString="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Initialize();
    }
    private void Initialize() {
        ExpressionTextView = findViewById(R.id.expression);
        result = findViewById(R.id.result);
        ExpressionTextView.setText("");
        result.setText("");
    }

    private void setExpression(String given_expression) {
        expressionString = expressionString + given_expression;
        ExpressionTextView.setText(expressionString);
    }

    public void clearOnClick(View view) {
        ExpressionTextView.setText("");
        result.setText("");
        expressionString = "";
    }

    public void equalOnClick(View view) {
        Double result_val = null;
        ScriptEngine engine = new RhinoScriptEngine();
        try {
            result_val = (Double) engine.eval(expressionString);
        } catch (ScriptException e) {
            Toast.makeText(this, "Invalid Expression", Toast.LENGTH_SHORT).show();
        }

        if (result_val != null) {
            result.setText(String.valueOf(result_val.doubleValue()));

        }



    }


    public void decimalOnClick(View view) {
        setExpression(".");
    }

    public void zeroOnClick(View view) {
        setExpression("0");
    }


    public void oneOnClick(View view) {
        setExpression("1");
    }

    public void twoOnClick(View view) {
        setExpression("2");
    }

    public void threeOnClick(View view) {
        setExpression("3");
    }

    public void fiveOnClick(View view) {
        setExpression("5");
    }

    public void sixOnClick(View view) {
        setExpression("6");
    }

    public void minusOnClick(View view) {
        setExpression("-");
    }

    public void sevenOnClick(View view) {
        setExpression("7");
    }

    public void eightOnClick(View view) {
        setExpression("8");
    }

    public void nineOnClick(View view) {
        setExpression("9");
    }

    public void multipleOnClick(View view) {
        setExpression("*");
    }


    public void powerOnClick(View view) {
        setExpression("^");
    }

    public void percentOnClick(View view) {
        setExpression("%");
    }

    public void divedOnClick(View view) {
        setExpression("/");
    }

    public void fourOnClick(View view) {
        setExpression("4");
    }

    public void plusOnClick(View view) {
        setExpression("+");
    }

}