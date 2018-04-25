package demo1;

import java.util.Random;

/**
 * <p> Date             :2018/4/25 </p>
 * <p> Module           : </p>
 * <p> Description      : </p>
 * <p> Remark           : </p>
 *
 * @author yangdejun
 * @version 1.0
 * <p>--------------------------------------------------------------</p>
 * <p>修改历史</p>
 * <p>    序号    日期    修改人    修改原因    </p>
 * <p>    1                                     </p>
 */
public class Client {

    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        while (i < MAX_COUNT) {
            mail.setApplellation(getRandString(5) + "先生(女士)");
            mail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
            sendMail(mail);
            i ++;
        }
    }

    //发送邮件
    public static void sendMail(Mail mail){
        System.out.println("标题："+mail.getSubject() + "\t收件人：" +
                ""+mail.getReceiver()+"\t....发送成功！");
    }

    //获得指定长度的随机字符串
    public static String getRandString(int maxLength){
        String source ="abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for(int i=0;i<maxLength;i++){
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}
