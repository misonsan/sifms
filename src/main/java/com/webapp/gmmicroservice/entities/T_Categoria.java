package com.webapp.gmmicroservice.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.webapp.gmmicroservice.entities.Prodotti;

@Entity
@Table(name="T_CATEGORIA_PRODOTTI")
@AllArgsConstructor @NoArgsConstructor
public class T_Categoria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2860111761127308579L;
	
	@Id
	@Column(name="id_categoria")
	@NotBlank(message = "{NotNull.T_Categoria.idCategoria.validation}") 
	@NotEmpty @NotNull
	@Getter @Setter
	private int idCategoria;
	
	@Column(name="d_categoria")
	@NotBlank @NotEmpty @NotNull
	@Size(min=1, max=50, message = "{Size.T_Categoria.dCategoria.validation}")
	@Getter @Setter	
	private String dCategoria;
	
	@Column(name="key_utenti_operation")
	@NotBlank @NotEmpty @NotNull
	@Getter @Setter	
	private int keyUserOp;
	
	@Column(name="data_operation")
	@Temporal(TemporalType.DATE)
	@Getter @Setter
	private Date dateOp;
		
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="categoria")
	private Set<Prodotti> prodotti = new HashSet<Prodotti>();

	   @PrePersist
		void getTimeOperation()
		    {
		        this.dateOp = new Date();
		    }
	}
