package me.rainbow.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author guojinpeng
 * @date 17.8.23 16:40
 */
public class HttpUtils {
//    public static void main(String[] args) {
//        String url = "https://open.api.tianyancha.com/services/v3/newopen/baseinfoV2.json";
//        HashMap<String, String> params = new HashMap<>();
//        params.put("id", "22822");
//        HashMap<String, String> customHeader = new HashMap<>();
//        customHeader.put("Authorization", "RTjvS1tLqAc7");
//        String s = doGet(url, params, customHeader);
//        System.out.println(s);
//        String result = doGet(url);
//        System.out.println(result);
//    }

    public static String doGet(String url, HashMap<String, String> params, HashMap<String, String> headers) {
        StringBuilder param = new StringBuilder();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            param.append(entry.getKey());
            param.append("=");
            param.append(entry.getValue());
            param.append("&");
        }
        StringBuilder result = new StringBuilder();
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param.toString();
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                connection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result.append(line);
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        } finally {
            // 使用finally块来关闭输入流
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result.toString();
    }

    public static String doGet(String url) {
//        HttpGet get = new HttpGet(url);
//        get.setHeader("Authorization", "RTjvS1tLqAc7");
//        HttpClientBuilder clientBuilder = HttpClientBuilder.create();
//        CloseableHttpClient client = clientBuilder.build();
        String result = null;
//        try {
//            CloseableHttpResponse response = client.execute(get);
//            if (response != null) {
//                HttpEntity resEntity = response.getEntity();
//                if (resEntity != null) {
//                    result = EntityUtils.toString(resEntity, "UTF-8");
//                }
//                response.close();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return result;
    }

    public static void doPost(String url) {

    }
}
