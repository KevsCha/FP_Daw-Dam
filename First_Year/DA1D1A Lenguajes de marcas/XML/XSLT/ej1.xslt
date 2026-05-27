<xsl:template match="/">
	<h1>Mis Ciclos</h1>
	<xsl:for-each select="ciclo">
		<p><xsl:value-of select="nombre"/></p>
	</xsl:for-each>
</xsl:template>
