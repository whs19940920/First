package com.mysecondmaven.component;

import com.mysecondmaven.base.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/4/26 0026.
 */
@Component
public class SgtPappers implements CompactDisc
{
    private String title="tianxia";
    private String content="haha";
    @Override
    public void play() {
        System.out.println("the title is "+title+" and the content is "+content);
    }
}
