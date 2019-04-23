
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class BMICalculatorBean {

   private String name;
   private double height;
   private double weight;
   private double BMI = 0;
    
    public BMICalculatorBean() {
    }
    
    public double calculateBMI(){
        if(height != 0){
            BMI = weight / (height*height);
        }
        return BMI;
    }

    public void clearFields(){
        name = null;
        height = 0.0;
        weight = 0.0;
        BMI = 0.0;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }
    
}
