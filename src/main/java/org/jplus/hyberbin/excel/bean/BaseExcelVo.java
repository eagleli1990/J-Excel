/*
 * Copyright 2014 Hyberbin.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * Email:hyberbin@qq.com
 */
package org.jplus.hyberbin.excel.bean;

/**
 * Created with IntelliJ IDEA.
 * User: Hyberbin
 * Date: 13-12-4
 * Time: 下午12:41
 */
public abstract class BaseExcelVo {
    private int row;
    private int col;
    private String message;

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public abstract int getHashVal();

    /**
     * 如果返回false将会加入到错误信息列表.
     * 开发者根据setMessage和getRow等setter和getter方法生成错误信息
     * @return
     */
    public boolean validate(){
          return true;
    }
}
