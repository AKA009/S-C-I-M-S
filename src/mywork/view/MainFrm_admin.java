/*
 *
 * Created on __DATE__, __TIME__
 */

package mywork.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author  __USER__
 */
public class MainFrm_admin extends javax.swing.JFrame {

	/** Creates new form MainFrm_admin */
	public MainFrm_admin() {
		initComponents();
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        table = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jmiCourseView = new javax.swing.JMenuItem();
        jmiCourseAdd = new javax.swing.JMenuItem();
        jmiCourseManage = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiStudentView = new javax.swing.JMenuItem();
        jmiStudentPassword = new javax.swing.JMenuItem();
        jmiExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("学生选课系统_管理员端");

        jMenu1.setText("基本操作");

        jMenu3.setText("选课相关");

        jmiCourseView.setText("查看选课情况");
        jmiCourseView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCourseViewActionPerformed(evt);
            }
        });
        jMenu3.add(jmiCourseView);

        jmiCourseAdd.setText("增加课程条目");
        jmiCourseAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCourseAddActionPerformed(evt);
            }
        });
        jMenu3.add(jmiCourseAdd);

        jmiCourseManage.setText("修改课程信息");
        jmiCourseManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCourseManageActionPerformed(evt);
            }
        });
        jMenu3.add(jmiCourseManage);

        jMenu1.add(jMenu3);

        jMenu4.setText("学生相关");

        jmiStudentView.setText("查看学生资料");
        jmiStudentView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiStudentViewActionPerformed(evt);
            }
        });
        jMenu4.add(jmiStudentView);

        jmiStudentPassword.setText("管理学生密码");
        jmiStudentPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiStudentPasswordActionPerformed(evt);
            }
        });
        jMenu4.add(jmiStudentPassword);

        jMenu1.add(jMenu4);

        jmiExit.setText("退出系统");
        jmiExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExitActionPerformed(evt);
            }
        });
        jMenu1.add(jmiExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("帮助");

        jMenuItem1.setText("操作指南");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnHelpClickActionPreformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("联系技术人员");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindDeveloperActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(table, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(table, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OnHelpClickActionPreformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnHelpClickActionPreformed
        HelpInternalFrame_admin helpInternalFrame_admin = new HelpInternalFrame_admin();
	helpInternalFrame_admin.setVisible(true);
	this.table.add(helpInternalFrame_admin);
    }//GEN-LAST:event_OnHelpClickActionPreformed

    private void FindDeveloperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindDeveloperActionPerformed
        FindDeveloperInternalFrame findDeveloperInternalFrame = new FindDeveloperInternalFrame();
	findDeveloperInternalFrame.setVisible(true);
	this.table.add(findDeveloperInternalFrame);
    }//GEN-LAST:event_FindDeveloperActionPerformed

	private void jmiStudentPasswordActionPerformed(
			java.awt.event.ActionEvent evt) {
		StudentPasswordInterFrm studentPasswordInterFrm = new StudentPasswordInterFrm();
		studentPasswordInterFrm.setVisible(true);
		this.table.add(studentPasswordInterFrm);
	}

	private void jmiStudentViewActionPerformed(java.awt.event.ActionEvent evt) {
		StudentViewInterFrm studentViewInterFrm = new StudentViewInterFrm();
		studentViewInterFrm.setVisible(true);
		this.table.add(studentViewInterFrm);
	}

	private void jmiCourseViewActionPerformed(java.awt.event.ActionEvent evt) {
		CourseViewInterFrm courseViewInterFrm = new CourseViewInterFrm();
		courseViewInterFrm.setVisible(true);
		this.table.add(courseViewInterFrm);
	}

	private void jmiCourseManageActionPerformed(java.awt.event.ActionEvent evt) {
		CourseManageInterFrm courseManageInterFrm = new CourseManageInterFrm();
		courseManageInterFrm.setVisible(true);
		this.table.add(courseManageInterFrm);
	}

	private void jmiCourseAddActionPerformed(java.awt.event.ActionEvent evt) {
		CourseAddInterFrm courseAddInterFrm = new CourseAddInterFrm();
		courseAddInterFrm.setVisible(true);
		this.table.add(courseAddInterFrm);
	}

	private void jmiExitActionPerformed(java.awt.event.ActionEvent evt) {
		int result = JOptionPane.showConfirmDialog(this, "确认退出？");
		if (result == 0) {
			this.dispose();
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainFrm_admin().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jmiCourseAdd;
    private javax.swing.JMenuItem jmiCourseManage;
    private javax.swing.JMenuItem jmiCourseView;
    private javax.swing.JMenuItem jmiExit;
    private javax.swing.JMenuItem jmiStudentPassword;
    private javax.swing.JMenuItem jmiStudentView;
    private javax.swing.JDesktopPane table;
    // End of variables declaration//GEN-END:variables

}