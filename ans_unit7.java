import java.util.ArrayList;
public class ans_unit7
{
    public void primes(int n){
        ArrayList<Integer> nums=new ArrayList();
        int jst=0;
        for (int i=2;i<=n;i++){
            nums.add(i);
        }
        for (int i=0;i<nums.size();i++){
            for (int x=0;x<nums.size();x++){
                for (int y=2;y<n;y++){
                    if (nums.get(x-jst)==nums.get(i)*y) {
                        nums.remove(x-jst);
                        jst++;
                    }
                }
                jst=0;
            }
        }
        for (int i=0;i<nums.size();i++){
            System.out.print(nums.get(i)+", ");
        }
    }
    
    public void gbc(int n){
        ArrayList<Integer> nums=new ArrayList();
        int jst=0;
        String ans=n+"=";
        boolean addOR=false;
        for (int i=2;i<=n;i++){
            nums.add(i);
        }
        for (int i=0;i<nums.size();i++){
            for (int x=0;x<nums.size();x++){
                for (int y=2;y<n;y++){
                    if (nums.get(x-jst)==nums.get(i)*y) {
                        nums.remove(x-jst);
                        jst++;
                    }
                }
                jst=0;
            }
        }
        for (int i=0;i<nums.size();i++){
            for (int x=0;x<nums.size();x++){
                if (nums.get(i)+nums.get(x)==n) {
                    if (addOR) ans+=" OR ";
                    ans+=nums.get(i)+"+"+nums.get(x);
                    nums.remove(x);
                    nums.remove(i);
                    addOR=true;
                }
            }
        }
        System.out.print(ans);
    }
    
    public void bigInts(String num1, String num2){
        ArrayList<Integer> fst=new ArrayList();
        ArrayList<Integer> scd=new ArrayList();
        for (int i=0;i<num1.length();i++){
            if (num1.length()>=num2.length())fst.add(Integer.parseInt(num1.substring(i, i+1)));
            else scd.add(Integer.parseInt(num1.substring(i, i+1)));
        }
        for (int i=0;i<num2.length();i++){
            if (num1.length()>=num2.length())scd.add(Integer.parseInt(num2.substring(i, i+1)));
            else fst.add(Integer.parseInt(num2.substring(i, i+1)));
        }
        for (int i=scd.size()-1;i>=0;i--){
            fst.set(fst.size()-scd.size()+i, fst.get(fst.size()-scd.size()+i)+scd.get(i));
        }
        System.out.print(fst);
        for (int i=fst.size()-1;i>=1;i--){
            if (fst.get(i)/10>=1){
                fst.set(i-1, fst.get(i-1)+(fst.get(i)/10));
                fst.set(i, fst.get(i)%10);
            }
        }
        if (fst.get(0)/10>=1){
            fst.add(0, fst.get(0)/10);
            fst.set(1, fst.get(1)%10);
        }
        System.out.print(fst);
    }
}
