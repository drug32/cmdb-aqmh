package com.chinatelecom.operations.aqmhserivce.config;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.IFill;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.builder.Controller;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Column;
import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.List;

public class MybatisGeneratorConfig {
    public static void main(String[] args) {
        // 数据源配置
        //内部会自行判断数据库类型
        DataSourceConfig.Builder dataSourceConfigBuilder = new DataSourceConfig
                .Builder(
                "jdbc:postgresql://134.95.237.173:8001/irad",
                "irad",
                "Irad173%");
        /**
         * 全局配置
         */
        GlobalConfig.Builder globalConfigBuilder = new GlobalConfig.Builder();
        // 代码生成目录
        String projectPath = System.getProperty("user.dir");
        globalConfigBuilder.outputDir(projectPath + "/src/main/java");
        // 作者
        globalConfigBuilder.author("SunHu");
        // 结束时是否打开文件夹
        globalConfigBuilder.openDir(false);
        // 是否覆盖旧的文件
        globalConfigBuilder.fileOverride();

        // 包配置，如模块名、实体、mapper、service、controller等
        PackageConfig.Builder packageConfigBuilder = new PackageConfig.Builder();
        packageConfigBuilder.parent("com.chinatelecom.operations.aqmhserivce");
        packageConfigBuilder.entity("entity");
        packageConfigBuilder.mapper("mapper");
        packageConfigBuilder.service("service");
        packageConfigBuilder.serviceImpl("service.impl");
        // 策略配置
        StrategyConfig.Builder strategyConfigBuilder = new StrategyConfig.Builder();
        // 设置需要映射的表名,字符串数组，可以生成多个表
        strategyConfigBuilder.addInclude("intf_soc_ipbaolumian");
        // 下划线转驼峰
        strategyConfigBuilder.entityBuilder().naming(NamingStrategy.underline_to_camel);
        strategyConfigBuilder.entityBuilder().columnNaming(NamingStrategy.underline_to_camel);
        // 去除前缀"t_"
        //strategyConfigBuilder.addTablePrefix("t_");
        //entity的Lombok
        strategyConfigBuilder.entityBuilder().enableLombok();

        // 配置模板
        TemplateConfig.Builder templateConfigBuilder = new TemplateConfig.Builder();
        //控制 不生成 controller
        templateConfigBuilder.controller("");
        //控制 不生成 mapperXml，后续根据自己需要创建
        templateConfigBuilder.mapperXml("");

        // 逻辑删除
       /* strategyConfigBuilder.entityBuilder().logicDeleteColumnName("deleted");
        strategyConfigBuilder.entityBuilder().logicDeletePropertyName("deleted");
*/
        //实体类中属性新增创建时间和修改时间两个属性
        /*// 创建时间
        IFill gmtCreate = new Column("create_time", FieldFill.INSERT);
        // 更新时间
        IFill gmtModified = new Column("update_time", FieldFill.INSERT_UPDATE);
        strategyConfigBuilder.entityBuilder().addTableFills(gmtCreate, gmtModified);*/
        // 乐观锁
        //strategyConfigBuilder.entityBuilder().enableSerialVersionUID();
        //strategyConfigBuilder.entityBuilder().versionColumnName("version");
        //strategyConfigBuilder.entityBuilder().versionPropertyName("version");
        // 创建代码生成器对象，加载配置
        AutoGenerator autoGenerator = new AutoGenerator(dataSourceConfigBuilder.build());
        autoGenerator.global(globalConfigBuilder.build());
        autoGenerator.packageInfo(packageConfigBuilder.build());
        autoGenerator.strategy(strategyConfigBuilder.build());
        autoGenerator.template(templateConfigBuilder.build());
        // 执行
        autoGenerator.execute();
    }
}