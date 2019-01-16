package com.webapp.gmmicroservice.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="PRODOTTI")
@AllArgsConstructor @NoArgsConstructor
public class Prodotti implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9186263093165092543L;
	
	@Id
	@Column(name="id_prodotto")
	@NotBlank @NotEmpty @NotNull
	@Getter @Setter
	private int idProdotto;
	
	@Column(name="descrizione_prodotto")
	@NotBlank @NotEmpty @NotNull
	@Getter @Setter	
	private  String descProdotto;
	
	@Column(name="disponibile")
	@NotNull
	@Getter @Setter		
	private int disp;
	
	@Column(name="scorta_minima")
	@NotNull
	@Getter @Setter	
	private int scomin;
	
	@Column(name="prezzo")
	@NotNull
	@Getter @Setter
	private float prezzo;
	
	@Column(name="qta_vendute")
	@NotNull
	@Getter @Setter
	private int qta;
	
	@Column(name="path_image")
	@NotBlank @NotEmpty @NotNull
	@Getter @Setter
	private String pathImage;
	
	@Column(name="key_utenti_operation")
	@NotBlank @NotEmpty @NotNull
	@Getter @Setter
	private int keyUserOp;
	
	@Column(name="data_operation")
	@Getter @Setter
	private Date dateOp;
	
    @PrePersist
	void getTimeOperation()
	    {
	        this.dateOp = new Date();
	    }
	
	
	// relazioni con altre tabelle
	@ManyToOne(optional = false)
	@JoinColumn(name= "categoria", nullable = false)
	private T_Categoria tcategoria;    // tabella T_Categoria_Prodotti
	
	// da completare
	
	//private T_Tipologia ttipologia;    // tabella T_Tipologia
	//private T_Competenza tcompetenza   // tabella T_Competenza_Prodotti
	//private T_Stato tstato;            // tabella T_Stato_prodotto
	
	

}
