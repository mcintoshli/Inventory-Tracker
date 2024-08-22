USE [master];
GO

-- Check if the database exists and drop it if it does
IF EXISTS (SELECT name FROM sys.databases WHERE name = N'InventoryTracker')
DROP DATABASE [InventoryTracker];
GO

CREATE DATABASE [InventoryTracker];
GO

-- if User invUser exist, delete it
IF EXISTS (SELECT loginname FROM master.dbo.syslogins WHERE name = N'invUser')
	DROP LOGIN invUser;
	
-- Create a server-level login for 'invUser'
-- Note: Adjust the password policy as needed
CREATE LOGIN invUser WITH PASSWORD = 'inv1234', CHECK_EXPIRATION = OFF, CHECK_POLICY = OFF;
GO

-- Change context to the newly created 'InventoryTracker' database
USE [InventoryTracker];
GO

IF EXISTS (Select 1 FROM sys.server_principals WHERE [name] = N'invUser')
	DROP USER invUser;
GO

CREATE USER invUser FOR LOGIN invUser;
GO

EXEC sp_addrolemember 'db_owner', 'invUser';
GO

CREATE TABLE [dbo].[INVENTORY](
	[upc_code] [varchar](30) NOT NULL,
	[stock_count] int NOT NULL,
	[returned_count] int NOT NULL,
	CONSTRAINT [PK_INVENTORY] PRIMARY KEY CLUSTERED (
		[upc_code] ASC,
		)
	);	
GO
	
CREATE TABLE [dbo].[ITEM](
	[upc_code] [varchar](30) NOT NULL,
	[name] [varchar](50) NOT NULL,
	[description] [varchar](300) NULL,
	[price] int NOT NULL,
	[weight] int NOT NULL,
	[shipping_size] [varchar](30) NOT NULL,
	CONSTRAINT [PK_ITEM] PRIMARY KEY CLUSTERED (
		[upc_code] ASC
	)
);
GO