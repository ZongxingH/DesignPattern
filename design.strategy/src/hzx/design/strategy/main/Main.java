package hzx.design.strategy.main;

import hzx.design.strategy.bean.OldCustomerFewStrategy;
import hzx.design.strategy.bean.Strategy;
import hzx.design.strategy.bean.StrategyContext;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.strategy.main
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/18 15:05
 */
public class Main {
    public static void main(String[] args){
        Strategy strategy = new OldCustomerFewStrategy();
        StrategyContext strategyContext = new StrategyContext(strategy);
        strategyContext.ptintPrice(998);
    }
}
