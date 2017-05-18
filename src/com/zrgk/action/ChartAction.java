package com.zrgk.action;

import java.awt.Font;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.DefaultPieDataset;

public class ChartAction {
private JFreeChart jfchart;
	
	public String execute(){
		//使用JFreeChartAPI创建图形对象,填充数据
		jfchart = ChartFactory.createPieChart3D("图书销量统计", // 图表标题
				getDataSet(), // 数据
				true, // 是否显示图例
				true, // 是否显示工具提示
				false // 是否生成URL
				);
		// 重新设置图标标题，改变字体
		jfchart.setTitle(new TextTitle("图书销量统计", new Font("黑体", Font.ITALIC,22)));
		// 取得统计图标的第一个图例
		LegendTitle legend = jfchart.getLegend(0);
		// 修改图例的字体
		legend.setItemFont(new Font("宋体", Font.BOLD, 14));
		// 获得饼图的Plot对象
		PiePlot plot = (PiePlot) jfchart.getPlot();
		// 设置饼图各部分的标签字体
		plot.setLabelFont(new Font("隶书", Font.BOLD, 12));
		// 设定背景透明度（0-1.0之间）
		plot.setBackgroundAlpha(0.9f);
		// 设定前景透明度（0-1.0之间）
		plot.setForegroundAlpha(0.50f);
		return "success";
	}

	public JFreeChart getJfchart() {
		return jfchart;
	}

	public void setJfchart(JFreeChart jfchart) {
		this.jfchart = jfchart;
	}
	
//	设置统计数据
	private DefaultPieDataset getDataSet() {
		DefaultPieDataset dataset = new DefaultPieDataset();
		dataset.setValue("精通Spring", 47000);
		dataset.setValue("JavaScript大全", 38000);
		dataset.setValue("UML建模图解", 31000);
		dataset.setValue("Java开发答疑", 29000);
		dataset.setValue("精通Hibernate", 25000);
		return dataset;
	}


}
