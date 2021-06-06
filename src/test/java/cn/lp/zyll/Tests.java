package cn.lp.zyll;

/**
 * @ClassName:Tests
 * @Auther: 李鹏
 * @Description: TODO 测试类
 * @Date: 2021/6/6 21:47
 * @Version: v1.0
 */
/*
 * @Author: 李鹏
 * @Description: TODO
 * @Date:  2021/6/6 22:51
 * @Version: v1.0
*/

public class Tests {
    
    //groovyScript("def result=''; def params=\"${_1}\".replaceAll('[\\\\[|\\\\]|\\\\s]', '').split(',').toList(); for(i = 0; i < params.size(); i++) {result+='* @param ' + params[i] + ((i < params.size() - 1) ? ': \\n ' : ': ')}; return result", methodParameters())
    //groovyScript("def result=''; def stop=false; def params=\"${_1}\".replaceAll('[\\\\[|\\\\]|\\\\s]', '').split(',').toList(); if (params.size()==1 && (params[0]==null || params[0]=='null' || params[0]=='')) { stop=true; }; if(!stop) { for(i=0; i < params.size(); i++) {result +=((i==0) ? '\\r\\n' : '') + ((i < params.size() - 1) ? ' * @param: ' + params[i] + '\\r\\n' : ' * @param: ' + params[i] + '')}; }; return result;", methodParameters())
    //groovyScript("if(\"${_1}\".length() == 2) {return '';} else {def result=''; def params=\"${_1}\".replaceAll('[\\\\[|\\\\]|\\\\s]', '').split(',').toList();for(i = 0; i < params.size(); i++) {if(i==0){result+='* @param ' + params[i] + ': '}else{result+='\\n' + ' * @param ' + params[i] + ': '}}; return result;}", methodParameters());

    /*
     * @Author: 李鹏
     * @Date:  2021/6/6 22:45
     * @Description: TODO
     * @param str1:
     * @param Str2:
     * @param ste2:
     * @return: int
    */
    public int test1(String str1,String Str2,String ste2) {
        
        
        
        return 1;

    }
}
