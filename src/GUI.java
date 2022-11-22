import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GUI() {

		DefaultCategoryDataset dataset = new DefaultCategoryDataset();

		dataset.addValue(212, "Classes", "JDK 1.0");
		dataset.addValue(504, "Classes", "JDK 1.1");
		dataset.addValue(1520, "Classes", "SDK 1.2");
		dataset.addValue(1842, "Classes", "SDK 1.3");
		dataset.addValue(2991, "Classes", "SDK 1.4");

		JFreeChart chart = ChartFactory.createBarChart3D("Evolution of JDK classes", "JDK version", "Class count",
				dataset, PlotOrientation.HORIZONTAL, false, true, false);

		// JFreeChart chart = ChartFactory.createBarChart3D("Evolution of JDK classes",
		// "JDK version", "Class count", dataset);
		// JFreeChart chart = ChartFactory.createBarChart("Evolution of JDK classes",
		// "JDK version", "Class count", dataset);
		// JFreeChart chart = ChartFactory.createLineChart("Evolution of JDK classes",
		// "JDK version", "Class count", dataset);

		ChartPanel panel = new ChartPanel(chart);

		this.setContentPane(panel);

		this.setVisible(true);
		this.setSize(400, 400);

	}
}
