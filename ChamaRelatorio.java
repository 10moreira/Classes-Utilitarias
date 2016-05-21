
/**
 *
 * @author  Mateus Moreira
 */
public class ChamaRelatorio {



public void ChamandoRelatorio(){ 

	try {
		    EntityManager em = EntityManagerUtil.getEntityManager();
		    List<Classe> lista = em.createQuery("from Classe").getResultList();
		    HashMap<String, Object> parametros = new HashMap<String, Object>();
		    String relatorio = "/../home/caminho/caminho/caminho/caminho/Classe.jasper";
		    JRDataSource dataSource = new JRBeanCollectionDataSource(lista);
		    JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, dataSource);
		    JDialog viewer = new JDialog(new javax.swing.JFrame(), "Visualização do Relátorio", true);
		    viewer.setSize(1024, 768);
		    viewer.setLocationRelativeTo(null);
		    JasperViewer jrviewer = new JasperViewer(impressao, true);
		    viewer.getContentPane().add(jrviewer.getContentPane());
		    viewer.setVisible(true);
		} catch (JRException ex) {
		    System.out.print("Erro: " + ex.getMessage());
        }

		}

	}
