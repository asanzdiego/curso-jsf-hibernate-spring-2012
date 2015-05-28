package app.parejas.persistencia;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Expression;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import app.parejas.modelo.Persona;

public class PersonaDaoHibernateTemplateImpl 
	extends HibernateDaoSupport implements PersonaDao {


	public List<Persona> listarHombres() {
		Persona pBusqueda=new Persona();
		pBusqueda.setSexo(Persona.HOMBRE);
//		return getHibernateTemplate()
//			.findByExample(Example.create(pBusqueda)
//							.excludeZeroes());
		
		return getHibernateTemplate().find("from Persona where sexo=?",Persona.HOMBRE);
		//Query by example	
//		return getHibernateTemplate()
//			.getSessionFactory().getCurrentSession()
//			.createCriteria(Persona.class)
//			.add(Example.create(pBusqueda).excludeZeroes())
//			.list();
	}

	public List<Persona> listarMujeres() {

		DetachedCriteria criteria=DetachedCriteria.forClass(Persona.class);
		criteria.add(Expression.in("sexo",new Object[]{Persona.MUJER,'M'}));
		
		return getHibernateTemplate().findByCriteria(criteria);							 		
	}

	public void borrar(Persona p) {
		getHibernateTemplate().delete(p);
		
	}

	public Persona buscar(String n) {
		return (Persona) getHibernateTemplate().get(Persona.class, n);
	}

	public void guardar(Persona p) {
		getHibernateTemplate().saveOrUpdate(p);
		
	}

	public List<Persona> listar() {
		//HQL
		return getHibernateTemplate().find("from Persona");
	}

	
}
