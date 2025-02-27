package org.example.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.extern.slf4j.Slf4j;
import org.example.anno.State;
@Slf4j
//ConstraintValidator<State, String>里的State是注解类，String是被注解的字段类型
public class StateValidation implements ConstraintValidator<State, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        log.info("开始校验State");
        //提供校验规则
        if(s==null){
            return false;
        }
        log.info("State校验通过，值不为空");
        if(s.equals("已发布")||s.equals("草稿")){
            return true;
        }
        return false;
    }
}
