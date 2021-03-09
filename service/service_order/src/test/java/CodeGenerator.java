package com.mymc.demo;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import org.junit.Test;

public class CodeGenerator {

    @Test
    public void run() {

        // 1����������������
        AutoGenerator mpg = new AutoGenerator();

        // 2��ȫ������
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir("D:\\Project\\xue_parent\\service\\service_order" + "/src/main/java");

        gc.setAuthor("mymc");
        gc.setOpen(false); //���ɺ��Ƿ����Դ������
        gc.setFileOverride(false); //��������ʱ�ļ��Ƿ񸲸�

        //UserServie
        gc.setServiceName("%sService");    //ȥ��Service�ӿڵ�����ĸI

        gc.setIdType(IdType.ID_WORKER_STR); //��������
        gc.setDateType(DateType.ONLY_DATE);//�������ɵ�ʵ��������������
        gc.setSwagger2(true);//����Swagger2ģʽ

        mpg.setGlobalConfig(gc);

        // 3������Դ����
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/xue_edu?serverTimezone=GMT%2B8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("admin");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

        // 4��������
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("eduorder"); //ģ����
        //��  com.atguigu.eduservice
        pc.setParent("com.mymc");
        //��  com.atguigu.eduservice.controller
        pc.setController("controller");
        pc.setEntity("entity");
        pc.setService("service");
        pc.setMapper("mapper");
        mpg.setPackageInfo(pc);

        // 5����������
        StrategyConfig strategy = new StrategyConfig();

        strategy.setInclude("t_order","t_pay_log");

        strategy.setNaming(NamingStrategy.underline_to_camel);//���ݿ��ӳ�䵽ʵ�����������
        strategy.setTablePrefix("t" + "_"); //����ʵ��ʱȥ����ǰ׺

        strategy.setColumnNaming(NamingStrategy.underline_to_camel);//���ݿ���ֶ�ӳ�䵽ʵ�����������
        strategy.setEntityLombokModel(true); // lombok ģ�� @Accessors(chain = true) setter��ʽ����

        strategy.setRestControllerStyle(true); //restful api��������
        strategy.setControllerMappingHyphenStyle(true); //url���շ�ת���ַ�

        mpg.setStrategy(strategy);


        // 6��ִ��
        mpg.execute();
    }
}
