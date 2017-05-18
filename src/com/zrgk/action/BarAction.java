package com.zrgk.action;

import java.awt.Color;
import java.awt.GradientPaint;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import com.opensymphony.xwork2.ActionSupport;

public class BarAction extends ActionSupport {
	private  JFreeChart chart ;
	@Override
	public String execute() throws Exception {
         chart = ChartFactory.createBarChart(
            "Bar Chart Demo 1",       // chart title
            "Category",               // domain axis label
            "Value",                  // range axis label
            createDataset(),                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );


        chart.setBackgroundPaint(Color.white);

        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);

        GradientPaint gp0 = new GradientPaint(0.0f, 0.0f, Color.blue,
                0.0f, 0.0f, new Color(0, 0, 64));
        GradientPaint gp1 = new GradientPaint(0.0f, 0.0f, Color.green,
                0.0f, 0.0f, new Color(0, 64, 0));
        GradientPaint gp2 = new GradientPaint(0.0f, 0.0f, Color.red,
                0.0f, 0.0f, new Color(64, 0, 0));
        renderer.setSeriesPaint(0, gp0);
        renderer.setSeriesPaint(1, gp1);
        renderer.setSeriesPaint(2, gp2);

        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(
                CategoryLabelPositions.createUpRotationLabelPositions(
                        Math.PI / 6.0));
		return SUCCESS;
	}
	  private static CategoryDataset createDataset() {
	        // row keys...
	        String series1 = "First";
	        String series2 = "Second";
	        String series3 = "Third";
	        // column keys...
	        String category1 = "Category 1";
	        String category2 = "Category 2";
	        String category3 = "Category 3";
	        String category4 = "Category 4";
	        String category5 = "Category 5";

	        // create the dataset...
	        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
	        dataset.addValue(1.0, series1, category1);
	        dataset.addValue(4.0, series1, category2);
	        dataset.addValue(3.0, series1, category3);
	        dataset.addValue(5.0, series1, category4);
	        dataset.addValue(5.0, series1, category5);
	        dataset.addValue(5.0, series2, category1);
	        dataset.addValue(7.0, series2, category2);
	        dataset.addValue(6.0, series2, category3);
	        dataset.addValue(8.0, series2, category4);
	        dataset.addValue(4.0, series2, category5);
	        dataset.addValue(4.0, series3, category1);
	        dataset.addValue(3.0, series3, category2);
	        dataset.addValue(2.0, series3, category3);
	        dataset.addValue(3.0, series3, category4);
	        dataset.addValue(6.0, series3, category5);

	        return dataset;

	    }

	
	
	public JFreeChart getChart() {
		return chart;
	}
	public void setChart(JFreeChart chart) {
		this.chart = chart;
	}
	
	

}
