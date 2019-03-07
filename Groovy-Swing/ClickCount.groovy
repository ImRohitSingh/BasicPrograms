/**
 * 
 */
package demo

/**
 * @author RS067558
 *
 */

import groovy.swing.SwingBuilder;
import java.awt.BorderLayout as BL
import static javax.swing.JFrame.EXIT_ON_CLOSE
import java.awt.*

count = 0
new SwingBuilder().edt 
{
	frame(	title: 'Click Count', 
			size: [150, 150], 
			show: true, 
			defaultCloseOperation: EXIT_ON_CLOSE ){
		borderLayout()
		textlabel = label(text: "Clicked ${count} time(s).", constraints: BL.CENTER)
		button(text:'Click Counter',
         actionPerformed: {	count++; textlabel.text = "Clicked ${count} time(s)."; 
			 println "click ${count} " }, 
		 constraints:BL.NORTH)
	}
}