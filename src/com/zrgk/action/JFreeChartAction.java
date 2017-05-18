package com.zrgk.action;

import java.awt.Font;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import com.opensymphony.xwork2.ActionSupport;

public class JFreeChartAction extends ActionSupport {
	//可出现在视图中的属性
	private JFreeChart chart;
	@Override
	public String execute() throws Exception {
		chart = ChartFactory.createPieChart3D("图书销量统计", // chart title
				createDataset(),
				true, 
				true, false);
//		PiePlot plot = (PiePlot) chart.getPlot();
//		plot.setSectionOutlinesVisible(false);
//		plot.setNoDataMessage("No data available");
		chart.setTitle(new TextTitle("图书销量统计", new Font("黑体", Font.ITALIC,22)));
		// 取得统计图标的第一个图例
		LegendTitle legend = chart.getLegend(0);
		// 修改图例的字体
		legend.setItemFont(new Font("宋体", Font.BOLD, 14));
		// 获得饼图的Plot对象
		PiePlot plot = (PiePlot) chart.getPlot();
		// 设置饼图各部分的标签字体
		plot.setLabelFont(new Font("隶书", Font.BOLD, 12));
		// 设定背景透明度（0-1.0之间）
		plot.setBackgroundAlpha(0.9f);
		// 设定前景透明度（0-1.0之间）
		plot.setForegroundAlpha(0.50f);
		return SUCCESS;
	}

	private static PieDataset createDataset() {
		DefaultPieDataset dataset = new DefaultPieDataset();
		dataset.setValue("One", new Double(43.2));
		dataset.setValue("Two", new Double(10.0));
		dataset.setValue("Three", new Double(27.5));
		dataset.setValue("Four", new Double(17.5));
		dataset.setValue("Five", new Double(11.0));
		dataset.setValue("Six", new Double(19.4));
		return dataset;
	}

	public JFreeChart getChart() {
		return chart;
	}

	public void setChart(JFreeChart chart) {
		this.chart = chart;
	}

}
