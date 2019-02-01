package com.justcrud.util;

import java.util.List;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.dictionary.py.Pinyin;

public class PinYinUtils {
    public static String hanZiToPinyin(String hanZi)
    {
    	StringBuilder stringBuilder=new StringBuilder();
        List<Pinyin> pinyinList = HanLP.convertToPinyinList(hanZi);

        for (Pinyin pinyin : pinyinList)
        {
        	
        	stringBuilder.append(pinyin.getPinyinWithoutTone()).append("-");
           
        }
        int len=stringBuilder.length();
        stringBuilder.delete(len-1, len);
        
        return stringBuilder.toString();
        
    }
    
    public static String hanZiToPinyin2(String hanZi)
    {

        
        return HanLP.convertToPinyinString(hanZi,"",false);
        
    }
}
