
-- --------------------------------------------------
-- Entity Designer DDL Script for SQL Server 2005, 2008, and Azure
-- --------------------------------------------------
-- Date Created: 02/25/2015 19:15:58
-- Generated from EDMX file: C:\github\2015-Hilltopper-Robotics\Team1732ScoutingWebForm\Team1732ScoutingWebForm\Model1.edmx
-- --------------------------------------------------

SET QUOTED_IDENTIFIER OFF;
GO
USE [2015_RECYCLE_RUSH];
GO
IF SCHEMA_ID(N'dbo') IS NULL EXECUTE(N'CREATE SCHEMA [dbo]');
GO

-- --------------------------------------------------
-- Dropping existing FOREIGN KEY constraints
-- --------------------------------------------------

IF OBJECT_ID(N'[dbo].[FK_MatchesStack_1_Totes]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[Matches] DROP CONSTRAINT [FK_MatchesStack_1_Totes];
GO
IF OBJECT_ID(N'[dbo].[FK_MatchesStack_1_Toppers]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[Matches] DROP CONSTRAINT [FK_MatchesStack_1_Toppers];
GO
IF OBJECT_ID(N'[dbo].[FK_MatchesStack_10_Toppers]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[Matches] DROP CONSTRAINT [FK_MatchesStack_10_Toppers];
GO
IF OBJECT_ID(N'[dbo].[FK_MatchesStack_10_Totes]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[Matches] DROP CONSTRAINT [FK_MatchesStack_10_Totes];
GO
IF OBJECT_ID(N'[dbo].[FK_MatchesStack_11_Toppers]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[Matches] DROP CONSTRAINT [FK_MatchesStack_11_Toppers];
GO
IF OBJECT_ID(N'[dbo].[FK_MatchesStack_11_Totes]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[Matches] DROP CONSTRAINT [FK_MatchesStack_11_Totes];
GO
IF OBJECT_ID(N'[dbo].[FK_MatchesStack_12_Toppers]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[Matches] DROP CONSTRAINT [FK_MatchesStack_12_Toppers];
GO
IF OBJECT_ID(N'[dbo].[FK_MatchesStack_12_Totes]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[Matches] DROP CONSTRAINT [FK_MatchesStack_12_Totes];
GO
IF OBJECT_ID(N'[dbo].[FK_MatchesStack_2_Toppers]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[Matches] DROP CONSTRAINT [FK_MatchesStack_2_Toppers];
GO
IF OBJECT_ID(N'[dbo].[FK_MatchesStack_2_Totes]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[Matches] DROP CONSTRAINT [FK_MatchesStack_2_Totes];
GO
IF OBJECT_ID(N'[dbo].[FK_MatchesStack_3_Toppers]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[Matches] DROP CONSTRAINT [FK_MatchesStack_3_Toppers];
GO
IF OBJECT_ID(N'[dbo].[FK_MatchesStack_3_Totes]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[Matches] DROP CONSTRAINT [FK_MatchesStack_3_Totes];
GO
IF OBJECT_ID(N'[dbo].[FK_MatchesStack_4_Toppers]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[Matches] DROP CONSTRAINT [FK_MatchesStack_4_Toppers];
GO
IF OBJECT_ID(N'[dbo].[FK_MatchesStack_4_Totes]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[Matches] DROP CONSTRAINT [FK_MatchesStack_4_Totes];
GO
IF OBJECT_ID(N'[dbo].[FK_MatchesStack_5_Toppers]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[Matches] DROP CONSTRAINT [FK_MatchesStack_5_Toppers];
GO
IF OBJECT_ID(N'[dbo].[FK_MatchesStack_5_Totes]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[Matches] DROP CONSTRAINT [FK_MatchesStack_5_Totes];
GO
IF OBJECT_ID(N'[dbo].[FK_MatchesStack_6_Toppers]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[Matches] DROP CONSTRAINT [FK_MatchesStack_6_Toppers];
GO
IF OBJECT_ID(N'[dbo].[FK_MatchesStack_6_Totes]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[Matches] DROP CONSTRAINT [FK_MatchesStack_6_Totes];
GO
IF OBJECT_ID(N'[dbo].[FK_MatchesStack_7_Toppers]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[Matches] DROP CONSTRAINT [FK_MatchesStack_7_Toppers];
GO
IF OBJECT_ID(N'[dbo].[FK_MatchesStack_7_Totes]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[Matches] DROP CONSTRAINT [FK_MatchesStack_7_Totes];
GO
IF OBJECT_ID(N'[dbo].[FK_MatchesStack_8_Toppers]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[Matches] DROP CONSTRAINT [FK_MatchesStack_8_Toppers];
GO
IF OBJECT_ID(N'[dbo].[FK_MatchesStack_9_Toppers]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[Matches] DROP CONSTRAINT [FK_MatchesStack_9_Toppers];
GO
IF OBJECT_ID(N'[dbo].[FK_MatchesStack_8_Totes]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[Matches] DROP CONSTRAINT [FK_MatchesStack_8_Totes];
GO
IF OBJECT_ID(N'[dbo].[FK_MatchesStack_9_Totes]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[Matches] DROP CONSTRAINT [FK_MatchesStack_9_Totes];
GO

-- --------------------------------------------------
-- Dropping existing tables
-- --------------------------------------------------

IF OBJECT_ID(N'[dbo].[Matches]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Matches];
GO
IF OBJECT_ID(N'[dbo].[Stack_1_Totes]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Stack_1_Totes];
GO
IF OBJECT_ID(N'[dbo].[Stack_1_Toppers]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Stack_1_Toppers];
GO
IF OBJECT_ID(N'[dbo].[Stack_2_Totes]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Stack_2_Totes];
GO
IF OBJECT_ID(N'[dbo].[Stack_3_Totes]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Stack_3_Totes];
GO
IF OBJECT_ID(N'[dbo].[Stack_4_Totes]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Stack_4_Totes];
GO
IF OBJECT_ID(N'[dbo].[Stack_5_Totes]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Stack_5_Totes];
GO
IF OBJECT_ID(N'[dbo].[Stack_6_Totes]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Stack_6_Totes];
GO
IF OBJECT_ID(N'[dbo].[Stack_2_Toppers]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Stack_2_Toppers];
GO
IF OBJECT_ID(N'[dbo].[Stack_3_Toppers]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Stack_3_Toppers];
GO
IF OBJECT_ID(N'[dbo].[Stack_4_Toppers]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Stack_4_Toppers];
GO
IF OBJECT_ID(N'[dbo].[Stack_5_Toppers]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Stack_5_Toppers];
GO
IF OBJECT_ID(N'[dbo].[Stack_6_Toppers]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Stack_6_Toppers];
GO
IF OBJECT_ID(N'[dbo].[Stack_10_Totes]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Stack_10_Totes];
GO
IF OBJECT_ID(N'[dbo].[Stack_7_Toppers]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Stack_7_Toppers];
GO
IF OBJECT_ID(N'[dbo].[Stack_8_Toppers]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Stack_8_Toppers];
GO
IF OBJECT_ID(N'[dbo].[Stack_9_Toppers]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Stack_9_Toppers];
GO
IF OBJECT_ID(N'[dbo].[Stack_10_Toppers]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Stack_10_Toppers];
GO
IF OBJECT_ID(N'[dbo].[Stack_7_Totes]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Stack_7_Totes];
GO
IF OBJECT_ID(N'[dbo].[Stack_8_Totes]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Stack_8_Totes];
GO
IF OBJECT_ID(N'[dbo].[Stack_9_Totes]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Stack_9_Totes];
GO
IF OBJECT_ID(N'[dbo].[Stack_11_Totes]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Stack_11_Totes];
GO
IF OBJECT_ID(N'[dbo].[Stack_12_Totes]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Stack_12_Totes];
GO
IF OBJECT_ID(N'[dbo].[Stack_11_Toppers]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Stack_11_Toppers];
GO
IF OBJECT_ID(N'[dbo].[Stack_12_Toppers]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Stack_12_Toppers];
GO

-- --------------------------------------------------
-- Creating all tables
-- --------------------------------------------------

-- Creating table 'Matches'
CREATE TABLE [dbo].[Matches] (
    [Team_Match] nvarchar(9)  NOT NULL,
    [Team] int  NOT NULL,
    [Match] int  NOT NULL,
    [Auto_tote_set] bit  NOT NULL,
    [Auto_tote_stack] bit  NOT NULL,
    [Auto_robot_set] bit  NOT NULL,
    [Auto_mobility] bit  NOT NULL,
    [Coop_stack] bit  NOT NULL,
    [Coop_Set] bit  NOT NULL,
    [Match_notes] nvarchar(max)  NOT NULL,
    [Stack_1_Totes_Team_Match] nvarchar(9)  NOT NULL,
    [Stack_1_Toppers_Team_Match] nvarchar(9)  NOT NULL,
    [Stack_10_Toppers_Team_Match] nvarchar(9)  NOT NULL,
    [Stack_10_Totes_Team_Match] nvarchar(9)  NOT NULL,
    [Stack_11_Toppers_Team_Match] nvarchar(9)  NOT NULL,
    [Stack_11_Totes_Team_Match] nvarchar(9)  NOT NULL,
    [Stack_12_Toppers_Team_Match] nvarchar(9)  NOT NULL,
    [Stack_12_Totes_Team_Match] nvarchar(9)  NOT NULL,
    [Stack_2_Toppers_Team_Match] nvarchar(9)  NOT NULL,
    [Stack_2_Totes_Team_Match] nvarchar(9)  NOT NULL,
    [Stack_3_Toppers_Team_Match] nvarchar(9)  NOT NULL,
    [Stack_3_Totes_Team_Match] nvarchar(9)  NOT NULL,
    [Stack_4_Toppers_Team_Match] nvarchar(9)  NOT NULL,
    [Stack_4_Totes_Team_Match] nvarchar(9)  NOT NULL,
    [Stack_5_Toppers_Team_Match] nvarchar(9)  NOT NULL,
    [Stack_5_Totes_Team_Match] nvarchar(9)  NOT NULL,
    [Stack_6_Toppers_Team_Match] nvarchar(9)  NOT NULL,
    [Stack_6_Totes_Team_Match] nvarchar(9)  NOT NULL,
    [Stack_7_Toppers_Team_Match] nvarchar(9)  NOT NULL,
    [Stack_7_Totes_Team_Match] nvarchar(9)  NOT NULL,
    [Stack_8_Toppers_Team_Match] nvarchar(9)  NOT NULL,
    [Stack_9_Toppers_Team_Match] nvarchar(9)  NOT NULL,
    [Stack_8_Totes_Team_Match] nvarchar(9)  NOT NULL,
    [Stack_9_Totes_Team_Match] nvarchar(9)  NOT NULL
);
GO

-- Creating table 'Stack_1_Totes'
CREATE TABLE [dbo].[Stack_1_Totes] (
    [PK] int IDENTITY(1,1) NOT NULL,
    [Team_Match] nvarchar(9)  NOT NULL,
    [TT1] bit  NOT NULL,
    [TT2] bit  NOT NULL,
    [TT3] bit  NOT NULL,
    [TT4] bit  NOT NULL,
    [TT5] bit  NOT NULL,
    [TT6] bit  NOT NULL
);
GO

-- Creating table 'Stack_1_Toppers'
CREATE TABLE [dbo].[Stack_1_Toppers] (
    [PK] int IDENTITY(1,1) NOT NULL,
    [Team_Match] nvarchar(9)  NOT NULL,
    [Bin] nvarchar(max)  NOT NULL,
    [Noodle] nvarchar(max)  NOT NULL
);
GO

-- Creating table 'Stack_2_Totes'
CREATE TABLE [dbo].[Stack_2_Totes] (
    [PK] int IDENTITY(1,1) NOT NULL,
    [Team_Match] nvarchar(9)  NOT NULL,
    [TT1] bit  NOT NULL,
    [TT2] bit  NOT NULL,
    [TT3] bit  NOT NULL,
    [TT4] bit  NOT NULL,
    [TT5] bit  NOT NULL,
    [TT6] bit  NOT NULL
);
GO

-- Creating table 'Stack_3_Totes'
CREATE TABLE [dbo].[Stack_3_Totes] (
    [PK] int IDENTITY(1,1) NOT NULL,
    [Team_Match] nvarchar(9)  NOT NULL,
    [TT1] bit  NOT NULL,
    [TT2] bit  NOT NULL,
    [TT3] bit  NOT NULL,
    [TT4] bit  NOT NULL,
    [TT5] bit  NOT NULL,
    [TT6] bit  NOT NULL
);
GO

-- Creating table 'Stack_4_Totes'
CREATE TABLE [dbo].[Stack_4_Totes] (
    [PK] int IDENTITY(1,1) NOT NULL,
    [Team_Match] nvarchar(9)  NOT NULL,
    [TT1] bit  NOT NULL,
    [TT2] bit  NOT NULL,
    [TT3] bit  NOT NULL,
    [TT4] bit  NOT NULL,
    [TT5] bit  NOT NULL,
    [TT6] bit  NOT NULL
);
GO

-- Creating table 'Stack_5_Totes'
CREATE TABLE [dbo].[Stack_5_Totes] (
    [PK] int IDENTITY(1,1) NOT NULL,
    [Team_Match] nvarchar(9)  NOT NULL,
    [TT1] bit  NOT NULL,
    [TT2] bit  NOT NULL,
    [TT3] bit  NOT NULL,
    [TT4] bit  NOT NULL,
    [TT5] bit  NOT NULL,
    [TT6] bit  NOT NULL
);
GO

-- Creating table 'Stack_6_Totes'
CREATE TABLE [dbo].[Stack_6_Totes] (
    [PK] int IDENTITY(1,1) NOT NULL,
    [Team_Match] nvarchar(9)  NOT NULL,
    [TT1] bit  NOT NULL,
    [TT2] bit  NOT NULL,
    [TT3] bit  NOT NULL,
    [TT4] bit  NOT NULL,
    [TT5] bit  NOT NULL,
    [TT6] bit  NOT NULL
);
GO

-- Creating table 'Stack_2_Toppers'
CREATE TABLE [dbo].[Stack_2_Toppers] (
    [PK] int IDENTITY(1,1) NOT NULL,
    [Team_Match] nvarchar(9)  NOT NULL,
    [Bin] nvarchar(max)  NOT NULL,
    [Noodle] nvarchar(max)  NOT NULL
);
GO

-- Creating table 'Stack_3_Toppers'
CREATE TABLE [dbo].[Stack_3_Toppers] (
    [PK] int IDENTITY(1,1) NOT NULL,
    [Team_Match] nvarchar(9)  NOT NULL,
    [Bin] nvarchar(max)  NOT NULL,
    [Noodle] nvarchar(max)  NOT NULL
);
GO

-- Creating table 'Stack_4_Toppers'
CREATE TABLE [dbo].[Stack_4_Toppers] (
    [PK] int IDENTITY(1,1) NOT NULL,
    [Team_Match] nvarchar(9)  NOT NULL,
    [Bin] nvarchar(max)  NOT NULL,
    [Noodle] nvarchar(max)  NOT NULL
);
GO

-- Creating table 'Stack_5_Toppers'
CREATE TABLE [dbo].[Stack_5_Toppers] (
    [PK] int IDENTITY(1,1) NOT NULL,
    [Team_Match] nvarchar(9)  NOT NULL,
    [Bin] nvarchar(max)  NOT NULL,
    [Noodle] nvarchar(max)  NOT NULL
);
GO

-- Creating table 'Stack_6_Toppers'
CREATE TABLE [dbo].[Stack_6_Toppers] (
    [PK] int IDENTITY(1,1) NOT NULL,
    [Team_Match] nvarchar(9)  NOT NULL,
    [Bin] nvarchar(max)  NOT NULL,
    [Noodle] nvarchar(max)  NOT NULL
);
GO

-- Creating table 'Stack_10_Totes'
CREATE TABLE [dbo].[Stack_10_Totes] (
    [PK] int IDENTITY(1,1) NOT NULL,
    [Team_Match] nvarchar(9)  NOT NULL,
    [TT1] bit  NOT NULL,
    [TT2] bit  NOT NULL,
    [TT3] bit  NOT NULL,
    [TT4] bit  NOT NULL,
    [TT5] bit  NOT NULL,
    [TT6] bit  NOT NULL
);
GO

-- Creating table 'Stack_7_Toppers'
CREATE TABLE [dbo].[Stack_7_Toppers] (
    [PK] int IDENTITY(1,1) NOT NULL,
    [Team_Match] nvarchar(9)  NOT NULL,
    [Bin] nvarchar(max)  NOT NULL,
    [Noodle] nvarchar(max)  NOT NULL
);
GO

-- Creating table 'Stack_8_Toppers'
CREATE TABLE [dbo].[Stack_8_Toppers] (
    [PK] int IDENTITY(1,1) NOT NULL,
    [Team_Match] nvarchar(9)  NOT NULL,
    [Bin] nvarchar(max)  NOT NULL,
    [Noodle] nvarchar(max)  NOT NULL
);
GO

-- Creating table 'Stack_9_Toppers'
CREATE TABLE [dbo].[Stack_9_Toppers] (
    [PK] int IDENTITY(1,1) NOT NULL,
    [Team_Match] nvarchar(9)  NOT NULL,
    [Bin] nvarchar(max)  NOT NULL,
    [Noodle] nvarchar(max)  NOT NULL
);
GO

-- Creating table 'Stack_10_Toppers'
CREATE TABLE [dbo].[Stack_10_Toppers] (
    [PK] int IDENTITY(1,1) NOT NULL,
    [Team_Match] nvarchar(9)  NOT NULL,
    [Bin] nvarchar(max)  NOT NULL,
    [Noodle] nvarchar(max)  NOT NULL
);
GO

-- Creating table 'Stack_7_Totes'
CREATE TABLE [dbo].[Stack_7_Totes] (
    [PK] int IDENTITY(1,1) NOT NULL,
    [Team_Match] nvarchar(9)  NOT NULL,
    [TT1] bit  NOT NULL,
    [TT2] bit  NOT NULL,
    [TT3] bit  NOT NULL,
    [TT4] bit  NOT NULL,
    [TT5] bit  NOT NULL,
    [TT6] bit  NOT NULL
);
GO

-- Creating table 'Stack_8_Totes'
CREATE TABLE [dbo].[Stack_8_Totes] (
    [PK] int IDENTITY(1,1) NOT NULL,
    [Team_Match] nvarchar(9)  NOT NULL,
    [TT1] bit  NOT NULL,
    [TT2] bit  NOT NULL,
    [TT3] bit  NOT NULL,
    [TT4] bit  NOT NULL,
    [TT5] bit  NOT NULL,
    [TT6] bit  NOT NULL
);
GO

-- Creating table 'Stack_9_Totes'
CREATE TABLE [dbo].[Stack_9_Totes] (
    [PK] int IDENTITY(1,1) NOT NULL,
    [Team_Match] nvarchar(9)  NOT NULL,
    [TT1] bit  NOT NULL,
    [TT2] bit  NOT NULL,
    [TT3] bit  NOT NULL,
    [TT4] bit  NOT NULL,
    [TT5] bit  NOT NULL,
    [TT6] bit  NOT NULL
);
GO

-- Creating table 'Stack_11_Totes'
CREATE TABLE [dbo].[Stack_11_Totes] (
    [PK] int IDENTITY(1,1) NOT NULL,
    [Team_Match] nvarchar(9)  NOT NULL,
    [TT1] bit  NOT NULL,
    [TT2] bit  NOT NULL,
    [TT3] bit  NOT NULL,
    [TT4] bit  NOT NULL,
    [TT5] bit  NOT NULL,
    [TT6] bit  NOT NULL
);
GO

-- Creating table 'Stack_12_Totes'
CREATE TABLE [dbo].[Stack_12_Totes] (
    [PK] int IDENTITY(1,1) NOT NULL,
    [Team_Match] nvarchar(9)  NOT NULL,
    [TT1] bit  NOT NULL,
    [TT2] bit  NOT NULL,
    [TT3] bit  NOT NULL,
    [TT4] bit  NOT NULL,
    [TT5] bit  NOT NULL,
    [TT6] bit  NOT NULL
);
GO

-- Creating table 'Stack_11_Toppers'
CREATE TABLE [dbo].[Stack_11_Toppers] (
    [PK] int IDENTITY(1,1) NOT NULL,
    [Team_Match] nvarchar(9)  NOT NULL,
    [Bin] nvarchar(max)  NOT NULL,
    [Noodle] nvarchar(max)  NOT NULL
);
GO

-- Creating table 'Stack_12_Toppers'
CREATE TABLE [dbo].[Stack_12_Toppers] (
    [PK] int IDENTITY(1,1) NOT NULL,
    [Team_Match] nvarchar(9)  NOT NULL,
    [Bin] nvarchar(max)  NOT NULL,
    [Noodle] nvarchar(max)  NOT NULL
);
GO

-- --------------------------------------------------
-- Creating all PRIMARY KEY constraints
-- --------------------------------------------------

-- Creating primary key on [Team_Match] in table 'Matches'
ALTER TABLE [dbo].[Matches]
ADD CONSTRAINT [PK_Matches]
    PRIMARY KEY CLUSTERED ([Team_Match] ASC);
GO

-- Creating primary key on [Team_Match] in table 'Stack_1_Totes'
ALTER TABLE [dbo].[Stack_1_Totes]
ADD CONSTRAINT [PK_Stack_1_Totes]
    PRIMARY KEY CLUSTERED ([Team_Match] ASC);
GO

-- Creating primary key on [Team_Match] in table 'Stack_1_Toppers'
ALTER TABLE [dbo].[Stack_1_Toppers]
ADD CONSTRAINT [PK_Stack_1_Toppers]
    PRIMARY KEY CLUSTERED ([Team_Match] ASC);
GO

-- Creating primary key on [Team_Match] in table 'Stack_2_Totes'
ALTER TABLE [dbo].[Stack_2_Totes]
ADD CONSTRAINT [PK_Stack_2_Totes]
    PRIMARY KEY CLUSTERED ([Team_Match] ASC);
GO

-- Creating primary key on [Team_Match] in table 'Stack_3_Totes'
ALTER TABLE [dbo].[Stack_3_Totes]
ADD CONSTRAINT [PK_Stack_3_Totes]
    PRIMARY KEY CLUSTERED ([Team_Match] ASC);
GO

-- Creating primary key on [Team_Match] in table 'Stack_4_Totes'
ALTER TABLE [dbo].[Stack_4_Totes]
ADD CONSTRAINT [PK_Stack_4_Totes]
    PRIMARY KEY CLUSTERED ([Team_Match] ASC);
GO

-- Creating primary key on [Team_Match] in table 'Stack_5_Totes'
ALTER TABLE [dbo].[Stack_5_Totes]
ADD CONSTRAINT [PK_Stack_5_Totes]
    PRIMARY KEY CLUSTERED ([Team_Match] ASC);
GO

-- Creating primary key on [Team_Match] in table 'Stack_6_Totes'
ALTER TABLE [dbo].[Stack_6_Totes]
ADD CONSTRAINT [PK_Stack_6_Totes]
    PRIMARY KEY CLUSTERED ([Team_Match] ASC);
GO

-- Creating primary key on [Team_Match] in table 'Stack_2_Toppers'
ALTER TABLE [dbo].[Stack_2_Toppers]
ADD CONSTRAINT [PK_Stack_2_Toppers]
    PRIMARY KEY CLUSTERED ([Team_Match] ASC);
GO

-- Creating primary key on [Team_Match] in table 'Stack_3_Toppers'
ALTER TABLE [dbo].[Stack_3_Toppers]
ADD CONSTRAINT [PK_Stack_3_Toppers]
    PRIMARY KEY CLUSTERED ([Team_Match] ASC);
GO

-- Creating primary key on [Team_Match] in table 'Stack_4_Toppers'
ALTER TABLE [dbo].[Stack_4_Toppers]
ADD CONSTRAINT [PK_Stack_4_Toppers]
    PRIMARY KEY CLUSTERED ([Team_Match] ASC);
GO

-- Creating primary key on [Team_Match] in table 'Stack_5_Toppers'
ALTER TABLE [dbo].[Stack_5_Toppers]
ADD CONSTRAINT [PK_Stack_5_Toppers]
    PRIMARY KEY CLUSTERED ([Team_Match] ASC);
GO

-- Creating primary key on [Team_Match] in table 'Stack_6_Toppers'
ALTER TABLE [dbo].[Stack_6_Toppers]
ADD CONSTRAINT [PK_Stack_6_Toppers]
    PRIMARY KEY CLUSTERED ([Team_Match] ASC);
GO

-- Creating primary key on [Team_Match] in table 'Stack_10_Totes'
ALTER TABLE [dbo].[Stack_10_Totes]
ADD CONSTRAINT [PK_Stack_10_Totes]
    PRIMARY KEY CLUSTERED ([Team_Match] ASC);
GO

-- Creating primary key on [Team_Match] in table 'Stack_7_Toppers'
ALTER TABLE [dbo].[Stack_7_Toppers]
ADD CONSTRAINT [PK_Stack_7_Toppers]
    PRIMARY KEY CLUSTERED ([Team_Match] ASC);
GO

-- Creating primary key on [Team_Match] in table 'Stack_8_Toppers'
ALTER TABLE [dbo].[Stack_8_Toppers]
ADD CONSTRAINT [PK_Stack_8_Toppers]
    PRIMARY KEY CLUSTERED ([Team_Match] ASC);
GO

-- Creating primary key on [Team_Match] in table 'Stack_9_Toppers'
ALTER TABLE [dbo].[Stack_9_Toppers]
ADD CONSTRAINT [PK_Stack_9_Toppers]
    PRIMARY KEY CLUSTERED ([Team_Match] ASC);
GO

-- Creating primary key on [Team_Match] in table 'Stack_10_Toppers'
ALTER TABLE [dbo].[Stack_10_Toppers]
ADD CONSTRAINT [PK_Stack_10_Toppers]
    PRIMARY KEY CLUSTERED ([Team_Match] ASC);
GO

-- Creating primary key on [Team_Match] in table 'Stack_7_Totes'
ALTER TABLE [dbo].[Stack_7_Totes]
ADD CONSTRAINT [PK_Stack_7_Totes]
    PRIMARY KEY CLUSTERED ([Team_Match] ASC);
GO

-- Creating primary key on [Team_Match] in table 'Stack_8_Totes'
ALTER TABLE [dbo].[Stack_8_Totes]
ADD CONSTRAINT [PK_Stack_8_Totes]
    PRIMARY KEY CLUSTERED ([Team_Match] ASC);
GO

-- Creating primary key on [Team_Match] in table 'Stack_9_Totes'
ALTER TABLE [dbo].[Stack_9_Totes]
ADD CONSTRAINT [PK_Stack_9_Totes]
    PRIMARY KEY CLUSTERED ([Team_Match] ASC);
GO

-- Creating primary key on [Team_Match] in table 'Stack_11_Totes'
ALTER TABLE [dbo].[Stack_11_Totes]
ADD CONSTRAINT [PK_Stack_11_Totes]
    PRIMARY KEY CLUSTERED ([Team_Match] ASC);
GO

-- Creating primary key on [Team_Match] in table 'Stack_12_Totes'
ALTER TABLE [dbo].[Stack_12_Totes]
ADD CONSTRAINT [PK_Stack_12_Totes]
    PRIMARY KEY CLUSTERED ([Team_Match] ASC);
GO

-- Creating primary key on [Team_Match] in table 'Stack_11_Toppers'
ALTER TABLE [dbo].[Stack_11_Toppers]
ADD CONSTRAINT [PK_Stack_11_Toppers]
    PRIMARY KEY CLUSTERED ([Team_Match] ASC);
GO

-- Creating primary key on [Team_Match] in table 'Stack_12_Toppers'
ALTER TABLE [dbo].[Stack_12_Toppers]
ADD CONSTRAINT [PK_Stack_12_Toppers]
    PRIMARY KEY CLUSTERED ([Team_Match] ASC);
GO

-- --------------------------------------------------
-- Creating all FOREIGN KEY constraints
-- --------------------------------------------------

-- Creating foreign key on [Stack_1_Totes_Team_Match] in table 'Matches'
ALTER TABLE [dbo].[Matches]
ADD CONSTRAINT [FK_MatchesStack_1_Totes]
    FOREIGN KEY ([Stack_1_Totes_Team_Match])
    REFERENCES [dbo].[Stack_1_Totes]
        ([Team_Match])
    ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Creating non-clustered index for FOREIGN KEY 'FK_MatchesStack_1_Totes'
CREATE INDEX [IX_FK_MatchesStack_1_Totes]
ON [dbo].[Matches]
    ([Stack_1_Totes_Team_Match]);
GO

-- Creating foreign key on [Stack_1_Toppers_Team_Match] in table 'Matches'
ALTER TABLE [dbo].[Matches]
ADD CONSTRAINT [FK_MatchesStack_1_Toppers]
    FOREIGN KEY ([Stack_1_Toppers_Team_Match])
    REFERENCES [dbo].[Stack_1_Toppers]
        ([Team_Match])
    ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Creating non-clustered index for FOREIGN KEY 'FK_MatchesStack_1_Toppers'
CREATE INDEX [IX_FK_MatchesStack_1_Toppers]
ON [dbo].[Matches]
    ([Stack_1_Toppers_Team_Match]);
GO

-- Creating foreign key on [Stack_10_Toppers_Team_Match] in table 'Matches'
ALTER TABLE [dbo].[Matches]
ADD CONSTRAINT [FK_MatchesStack_10_Toppers]
    FOREIGN KEY ([Stack_10_Toppers_Team_Match])
    REFERENCES [dbo].[Stack_10_Toppers]
        ([Team_Match])
    ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Creating non-clustered index for FOREIGN KEY 'FK_MatchesStack_10_Toppers'
CREATE INDEX [IX_FK_MatchesStack_10_Toppers]
ON [dbo].[Matches]
    ([Stack_10_Toppers_Team_Match]);
GO

-- Creating foreign key on [Stack_10_Totes_Team_Match] in table 'Matches'
ALTER TABLE [dbo].[Matches]
ADD CONSTRAINT [FK_MatchesStack_10_Totes]
    FOREIGN KEY ([Stack_10_Totes_Team_Match])
    REFERENCES [dbo].[Stack_10_Totes]
        ([Team_Match])
    ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Creating non-clustered index for FOREIGN KEY 'FK_MatchesStack_10_Totes'
CREATE INDEX [IX_FK_MatchesStack_10_Totes]
ON [dbo].[Matches]
    ([Stack_10_Totes_Team_Match]);
GO

-- Creating foreign key on [Stack_11_Toppers_Team_Match] in table 'Matches'
ALTER TABLE [dbo].[Matches]
ADD CONSTRAINT [FK_MatchesStack_11_Toppers]
    FOREIGN KEY ([Stack_11_Toppers_Team_Match])
    REFERENCES [dbo].[Stack_11_Toppers]
        ([Team_Match])
    ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Creating non-clustered index for FOREIGN KEY 'FK_MatchesStack_11_Toppers'
CREATE INDEX [IX_FK_MatchesStack_11_Toppers]
ON [dbo].[Matches]
    ([Stack_11_Toppers_Team_Match]);
GO

-- Creating foreign key on [Stack_11_Totes_Team_Match] in table 'Matches'
ALTER TABLE [dbo].[Matches]
ADD CONSTRAINT [FK_MatchesStack_11_Totes]
    FOREIGN KEY ([Stack_11_Totes_Team_Match])
    REFERENCES [dbo].[Stack_11_Totes]
        ([Team_Match])
    ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Creating non-clustered index for FOREIGN KEY 'FK_MatchesStack_11_Totes'
CREATE INDEX [IX_FK_MatchesStack_11_Totes]
ON [dbo].[Matches]
    ([Stack_11_Totes_Team_Match]);
GO

-- Creating foreign key on [Stack_12_Toppers_Team_Match] in table 'Matches'
ALTER TABLE [dbo].[Matches]
ADD CONSTRAINT [FK_MatchesStack_12_Toppers]
    FOREIGN KEY ([Stack_12_Toppers_Team_Match])
    REFERENCES [dbo].[Stack_12_Toppers]
        ([Team_Match])
    ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Creating non-clustered index for FOREIGN KEY 'FK_MatchesStack_12_Toppers'
CREATE INDEX [IX_FK_MatchesStack_12_Toppers]
ON [dbo].[Matches]
    ([Stack_12_Toppers_Team_Match]);
GO

-- Creating foreign key on [Stack_12_Totes_Team_Match] in table 'Matches'
ALTER TABLE [dbo].[Matches]
ADD CONSTRAINT [FK_MatchesStack_12_Totes]
    FOREIGN KEY ([Stack_12_Totes_Team_Match])
    REFERENCES [dbo].[Stack_12_Totes]
        ([Team_Match])
    ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Creating non-clustered index for FOREIGN KEY 'FK_MatchesStack_12_Totes'
CREATE INDEX [IX_FK_MatchesStack_12_Totes]
ON [dbo].[Matches]
    ([Stack_12_Totes_Team_Match]);
GO

-- Creating foreign key on [Stack_2_Toppers_Team_Match] in table 'Matches'
ALTER TABLE [dbo].[Matches]
ADD CONSTRAINT [FK_MatchesStack_2_Toppers]
    FOREIGN KEY ([Stack_2_Toppers_Team_Match])
    REFERENCES [dbo].[Stack_2_Toppers]
        ([Team_Match])
    ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Creating non-clustered index for FOREIGN KEY 'FK_MatchesStack_2_Toppers'
CREATE INDEX [IX_FK_MatchesStack_2_Toppers]
ON [dbo].[Matches]
    ([Stack_2_Toppers_Team_Match]);
GO

-- Creating foreign key on [Stack_2_Totes_Team_Match] in table 'Matches'
ALTER TABLE [dbo].[Matches]
ADD CONSTRAINT [FK_MatchesStack_2_Totes]
    FOREIGN KEY ([Stack_2_Totes_Team_Match])
    REFERENCES [dbo].[Stack_2_Totes]
        ([Team_Match])
    ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Creating non-clustered index for FOREIGN KEY 'FK_MatchesStack_2_Totes'
CREATE INDEX [IX_FK_MatchesStack_2_Totes]
ON [dbo].[Matches]
    ([Stack_2_Totes_Team_Match]);
GO

-- Creating foreign key on [Stack_3_Toppers_Team_Match] in table 'Matches'
ALTER TABLE [dbo].[Matches]
ADD CONSTRAINT [FK_MatchesStack_3_Toppers]
    FOREIGN KEY ([Stack_3_Toppers_Team_Match])
    REFERENCES [dbo].[Stack_3_Toppers]
        ([Team_Match])
    ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Creating non-clustered index for FOREIGN KEY 'FK_MatchesStack_3_Toppers'
CREATE INDEX [IX_FK_MatchesStack_3_Toppers]
ON [dbo].[Matches]
    ([Stack_3_Toppers_Team_Match]);
GO

-- Creating foreign key on [Stack_3_Totes_Team_Match] in table 'Matches'
ALTER TABLE [dbo].[Matches]
ADD CONSTRAINT [FK_MatchesStack_3_Totes]
    FOREIGN KEY ([Stack_3_Totes_Team_Match])
    REFERENCES [dbo].[Stack_3_Totes]
        ([Team_Match])
    ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Creating non-clustered index for FOREIGN KEY 'FK_MatchesStack_3_Totes'
CREATE INDEX [IX_FK_MatchesStack_3_Totes]
ON [dbo].[Matches]
    ([Stack_3_Totes_Team_Match]);
GO

-- Creating foreign key on [Stack_4_Toppers_Team_Match] in table 'Matches'
ALTER TABLE [dbo].[Matches]
ADD CONSTRAINT [FK_MatchesStack_4_Toppers]
    FOREIGN KEY ([Stack_4_Toppers_Team_Match])
    REFERENCES [dbo].[Stack_4_Toppers]
        ([Team_Match])
    ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Creating non-clustered index for FOREIGN KEY 'FK_MatchesStack_4_Toppers'
CREATE INDEX [IX_FK_MatchesStack_4_Toppers]
ON [dbo].[Matches]
    ([Stack_4_Toppers_Team_Match]);
GO

-- Creating foreign key on [Stack_4_Totes_Team_Match] in table 'Matches'
ALTER TABLE [dbo].[Matches]
ADD CONSTRAINT [FK_MatchesStack_4_Totes]
    FOREIGN KEY ([Stack_4_Totes_Team_Match])
    REFERENCES [dbo].[Stack_4_Totes]
        ([Team_Match])
    ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Creating non-clustered index for FOREIGN KEY 'FK_MatchesStack_4_Totes'
CREATE INDEX [IX_FK_MatchesStack_4_Totes]
ON [dbo].[Matches]
    ([Stack_4_Totes_Team_Match]);
GO

-- Creating foreign key on [Stack_5_Toppers_Team_Match] in table 'Matches'
ALTER TABLE [dbo].[Matches]
ADD CONSTRAINT [FK_MatchesStack_5_Toppers]
    FOREIGN KEY ([Stack_5_Toppers_Team_Match])
    REFERENCES [dbo].[Stack_5_Toppers]
        ([Team_Match])
    ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Creating non-clustered index for FOREIGN KEY 'FK_MatchesStack_5_Toppers'
CREATE INDEX [IX_FK_MatchesStack_5_Toppers]
ON [dbo].[Matches]
    ([Stack_5_Toppers_Team_Match]);
GO

-- Creating foreign key on [Stack_5_Totes_Team_Match] in table 'Matches'
ALTER TABLE [dbo].[Matches]
ADD CONSTRAINT [FK_MatchesStack_5_Totes]
    FOREIGN KEY ([Stack_5_Totes_Team_Match])
    REFERENCES [dbo].[Stack_5_Totes]
        ([Team_Match])
    ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Creating non-clustered index for FOREIGN KEY 'FK_MatchesStack_5_Totes'
CREATE INDEX [IX_FK_MatchesStack_5_Totes]
ON [dbo].[Matches]
    ([Stack_5_Totes_Team_Match]);
GO

-- Creating foreign key on [Stack_6_Toppers_Team_Match] in table 'Matches'
ALTER TABLE [dbo].[Matches]
ADD CONSTRAINT [FK_MatchesStack_6_Toppers]
    FOREIGN KEY ([Stack_6_Toppers_Team_Match])
    REFERENCES [dbo].[Stack_6_Toppers]
        ([Team_Match])
    ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Creating non-clustered index for FOREIGN KEY 'FK_MatchesStack_6_Toppers'
CREATE INDEX [IX_FK_MatchesStack_6_Toppers]
ON [dbo].[Matches]
    ([Stack_6_Toppers_Team_Match]);
GO

-- Creating foreign key on [Stack_6_Totes_Team_Match] in table 'Matches'
ALTER TABLE [dbo].[Matches]
ADD CONSTRAINT [FK_MatchesStack_6_Totes]
    FOREIGN KEY ([Stack_6_Totes_Team_Match])
    REFERENCES [dbo].[Stack_6_Totes]
        ([Team_Match])
    ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Creating non-clustered index for FOREIGN KEY 'FK_MatchesStack_6_Totes'
CREATE INDEX [IX_FK_MatchesStack_6_Totes]
ON [dbo].[Matches]
    ([Stack_6_Totes_Team_Match]);
GO

-- Creating foreign key on [Stack_7_Toppers_Team_Match] in table 'Matches'
ALTER TABLE [dbo].[Matches]
ADD CONSTRAINT [FK_MatchesStack_7_Toppers]
    FOREIGN KEY ([Stack_7_Toppers_Team_Match])
    REFERENCES [dbo].[Stack_7_Toppers]
        ([Team_Match])
    ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Creating non-clustered index for FOREIGN KEY 'FK_MatchesStack_7_Toppers'
CREATE INDEX [IX_FK_MatchesStack_7_Toppers]
ON [dbo].[Matches]
    ([Stack_7_Toppers_Team_Match]);
GO

-- Creating foreign key on [Stack_7_Totes_Team_Match] in table 'Matches'
ALTER TABLE [dbo].[Matches]
ADD CONSTRAINT [FK_MatchesStack_7_Totes]
    FOREIGN KEY ([Stack_7_Totes_Team_Match])
    REFERENCES [dbo].[Stack_7_Totes]
        ([Team_Match])
    ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Creating non-clustered index for FOREIGN KEY 'FK_MatchesStack_7_Totes'
CREATE INDEX [IX_FK_MatchesStack_7_Totes]
ON [dbo].[Matches]
    ([Stack_7_Totes_Team_Match]);
GO

-- Creating foreign key on [Stack_8_Toppers_Team_Match] in table 'Matches'
ALTER TABLE [dbo].[Matches]
ADD CONSTRAINT [FK_MatchesStack_8_Toppers]
    FOREIGN KEY ([Stack_8_Toppers_Team_Match])
    REFERENCES [dbo].[Stack_8_Toppers]
        ([Team_Match])
    ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Creating non-clustered index for FOREIGN KEY 'FK_MatchesStack_8_Toppers'
CREATE INDEX [IX_FK_MatchesStack_8_Toppers]
ON [dbo].[Matches]
    ([Stack_8_Toppers_Team_Match]);
GO

-- Creating foreign key on [Stack_9_Toppers_Team_Match] in table 'Matches'
ALTER TABLE [dbo].[Matches]
ADD CONSTRAINT [FK_MatchesStack_9_Toppers]
    FOREIGN KEY ([Stack_9_Toppers_Team_Match])
    REFERENCES [dbo].[Stack_9_Toppers]
        ([Team_Match])
    ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Creating non-clustered index for FOREIGN KEY 'FK_MatchesStack_9_Toppers'
CREATE INDEX [IX_FK_MatchesStack_9_Toppers]
ON [dbo].[Matches]
    ([Stack_9_Toppers_Team_Match]);
GO

-- Creating foreign key on [Stack_8_Totes_Team_Match] in table 'Matches'
ALTER TABLE [dbo].[Matches]
ADD CONSTRAINT [FK_MatchesStack_8_Totes]
    FOREIGN KEY ([Stack_8_Totes_Team_Match])
    REFERENCES [dbo].[Stack_8_Totes]
        ([Team_Match])
    ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Creating non-clustered index for FOREIGN KEY 'FK_MatchesStack_8_Totes'
CREATE INDEX [IX_FK_MatchesStack_8_Totes]
ON [dbo].[Matches]
    ([Stack_8_Totes_Team_Match]);
GO

-- Creating foreign key on [Stack_9_Totes_Team_Match] in table 'Matches'
ALTER TABLE [dbo].[Matches]
ADD CONSTRAINT [FK_MatchesStack_9_Totes]
    FOREIGN KEY ([Stack_9_Totes_Team_Match])
    REFERENCES [dbo].[Stack_9_Totes]
        ([Team_Match])
    ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Creating non-clustered index for FOREIGN KEY 'FK_MatchesStack_9_Totes'
CREATE INDEX [IX_FK_MatchesStack_9_Totes]
ON [dbo].[Matches]
    ([Stack_9_Totes_Team_Match]);
GO

-- --------------------------------------------------
-- Script has ended
-- --------------------------------------------------