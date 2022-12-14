/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package AMA.OpenGov.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the comments service. Represents a row in the &quot;ogp_comments&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link AMA.OpenGov.model.impl.commentsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AMA.OpenGov.model.impl.commentsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see comments
 * @see AMA.OpenGov.model.impl.commentsImpl
 * @see AMA.OpenGov.model.impl.commentsModelImpl
 * @generated
 */
@ProviderType
public interface commentsModel extends BaseModel<comments> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a comments model instance should use the {@link comments} interface instead.
	 */

	/**
	 * Returns the primary key of this comments.
	 *
	 * @return the primary key of this comments
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this comments.
	 *
	 * @param primaryKey the primary key of this comments
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this comments.
	 *
	 * @return the uuid of this comments
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this comments.
	 *
	 * @param uuid the uuid of this comments
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the ID of this comments.
	 *
	 * @return the ID of this comments
	 */
	public long getId();

	/**
	 * Sets the ID of this comments.
	 *
	 * @param id the ID of this comments
	 */
	public void setId(long id);

	/**
	 * Returns the nome of this comments.
	 *
	 * @return the nome of this comments
	 */
	@AutoEscape
	public String getNome();

	/**
	 * Sets the nome of this comments.
	 *
	 * @param nome the nome of this comments
	 */
	public void setNome(String nome);

	/**
	 * Returns the email of this comments.
	 *
	 * @return the email of this comments
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this comments.
	 *
	 * @param email the email of this comments
	 */
	public void setEmail(String email);

	/**
	 * Returns the mensagem of this comments.
	 *
	 * @return the mensagem of this comments
	 */
	@AutoEscape
	public String getMensagem();

	/**
	 * Sets the mensagem of this comments.
	 *
	 * @param mensagem the mensagem of this comments
	 */
	public void setMensagem(String mensagem);

	/**
	 * Returns the status of this comments.
	 *
	 * @return the status of this comments
	 */
	public boolean getStatus();

	/**
	 * Returns <code>true</code> if this comments is status.
	 *
	 * @return <code>true</code> if this comments is status; <code>false</code> otherwise
	 */
	public boolean isStatus();

	/**
	 * Sets whether this comments is status.
	 *
	 * @param status the status of this comments
	 */
	public void setStatus(boolean status);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(AMA.OpenGov.model.comments comments);

	@Override
	public int hashCode();

	@Override
	public CacheModel<AMA.OpenGov.model.comments> toCacheModel();

	@Override
	public AMA.OpenGov.model.comments toEscapedModel();

	@Override
	public AMA.OpenGov.model.comments toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}