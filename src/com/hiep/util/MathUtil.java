/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiep.util;

/**
 *
 * @author Thanh Hiệp
 */
// class này chứa những hàm toán học, tính toán gì đó, giúp cho mọi nơi khác
//mang tính chất xài xhung cho mọi nơi , ta sẽ dùng kỹ thuật
//STATIC
public class MathUtil {
    //tính n!=1.2.3....n -> vì n! tăng kết quả rất nhanh, sẽ tràn điều kiện sớm
    //do int chỉ tối đa 2 tỷ 1, do đó xài long an toàn hơn
    //tuy thế 15! đã là to lắm, mình hạn chế tính 15! trờ lại
    public static long computeFactorial(int n){
        long result = 1;
        for (int i=1 ; i<=n ; i++) {
            result *= i ;
        }
        return result;
    }
}
